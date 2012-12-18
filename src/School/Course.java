/**
 * @author Raman Buttar - 301007414
 * CMPT 275 - Team Blank
 * SFU Surrey Campus
 * February 6, 2006
 * ===============================
 * NOTE: This class defines the Course objects
 * Feb. 20, 2006 - Edit by Trevor Choo
 */

package School;

import Features.Predictor;
import GUI.Main;
import java.io.Serializable;
import java.util.LinkedList;

public class Course implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String department;
    private int number;
    private double markPercent;
    private String markLetter, markStatus;
    private double gradePoints, credits;
    private boolean complete;
    private LinkedList<CourseItem> courseItems = new LinkedList();
    
    private double[] percentRanges = new double[]
    {50, 58, 66, 70, 74, 78, 82, 86, 90, 94};
    
    private static final String[] letterGrades = new String[]
    {"F", "D", "C-", "C", "C+", "B-", "B", "B+", "A-", "A", "A+"};
    
    
    public Course(String department, int number, double credits){
        //Constructor for courses that are currently in progress
        //Final mark does not need to be specified; it's calculated
        //Department is always stored in UPPER Case
        this.department = department.toUpperCase();
        this.number = number;
        this.credits = credits;
        this.complete = false;
        this.calculateCourseMarks();
    }
    
    public Course(String department, int number, double credits, String markLetter){
        //Constructors for courses that have been completed
        //Final Percentage mark need to be specified only
        this.department = department.toUpperCase();
        this.number = number;
        this.credits = credits;
        this.complete = true;
        this.markLetter = markLetter;
        this.calculateCourseMarks();
    }
    
    public Course(Course src) {
        //copy constructor
        this.department = src.getDepartment();
        this.number = src.getNumber();
        this.credits = src.getCredits();
        this.complete = src.isComplete();
        this.markLetter = src.getMarkLetter();
        this.markStatus = src.getMarkStatus();
        this.markPercent = src.getMarkPercent();
        this.gradePoints = src.getGradePoints();
        this.complete = src.isComplete();
        this.percentRanges = src.getPercentRange();
        
        
        //copy all courseItems into the new list
        String allCourseItems[] = src.getAllCourseItemsNames();
        CourseItem cpy;
        for(int i=0; i<allCourseItems.length; i++) {
            //copy the course item
            cpy = new CourseItem(src.getCourseItem(allCourseItems[i]));
            this.addCourseItem(cpy);
        }
        
        this.calculateCourseMarks();
    }
            
    public int addCourseItem(CourseItem item){
        //Creates a new Course Item if:
            //it doesn't already exist in a Course and
            //Item's weight does not exceed 100%
        //Returns an int according to operation's success
        
        double temp = this.getTotalPercentage();
        if (temp + item.getWeight() > 100){
            return -1;
        } else if (this.getCourseItem(item.getLabel()) != null){
            return 0;
        } else {
            item.setLabel(Main.capatalizeString(item.getLabel()));
            courseItems.add(item);
            this.calculateCourseMarks();
            return 1;
        }
    }
    
    public boolean removeCourseItem(String label){
        //Removes a Course Item from a Course if Item exists in a Course
        //Returns a boolean according to sucess of Course removal
        CourseItem item = this.getCourseItem(label);
        if (item != null){
            courseItems.remove(item);
            this.calculateCourseMarks();
            return true;
        } else {
            return false;
        }
    }
    
    public CourseItem getCourseItem(String label){
        //Returns a Course Item if Course Item with provided label exists in a Course
        //Otherwise returns null
        label = Main.capatalizeString(label);
        for (int i = 0; i < courseItems.size(); i++){
            CourseItem item =  courseItems.get(i);
            if (item.getLabel().equals(label)){
                this.calculateCourseMarks();
                return item;
            }
        }
        return null;
    }
       
    public Object[] getCourseItemData(){
        //Returns an Object array that contains String arrays for each Course that hold the data to be displayed
        this.calculateCourseMarks();
        Object[] arr = new Object[courseItems.size()];
        for (int i = 0; i < courseItems.size(); i++){
            CourseItem item = courseItems.get(i);
            String[] data = new String[]{item.getLabel(), "" + item.getStudentMark(),
            "" + item.getTotalMark(), "" + item.getWeight(), "" + item.isMarked()};
            arr[i] = data;
        }
        return arr;
    }
    
    public String[] getAllCourseItemsNames() {
        //Returns an array of Strings listing all CourseItem labels contained within the linked list
        String[] arr = new String[courseItems.size()];
        for(int i=0; i<courseItems.size(); i++) {
            String name = courseItems.get(i).getLabel();
            arr[i] = name;
        }
        return arr;
    }
    public void setPercentRange(double[] arr){
        //Accepts an array of doubles and sets letter grade percent range values
        //Array values specify percent range values for where each letter grade falls for
        //a particular Course
        //If percent range is not defined, a default one is used
        this.percentRanges = arr;
        this.calculateCourseMarks();
    }
    
    private double getTotalPercentage(){
        //Returns the total percentage of all entered Course Items in a Course
        //Total Percentage for a course shoudldn't exceed 100%
        double temp = 0;
        for (int i = 0; i < courseItems.size(); i++){
            CourseItem item =  courseItems.get(i);
            temp += item.getWeight();
        }
        return temp;
    }

    public double[] getPercentRange(){
        //Returns current percentage range for each letter grade as an array of doubles
        return this.percentRanges;
    }
    
    private double letterToPercent(String letter){
        //Maps given letter grade to a percent, based on current percentage range
        for (int i = 0; i < percentRanges.length; i++){
            if (letter.equals(letterGrades[i])){
                return percentRanges[i] - 1;
            }
        }
        //if letter grade is A+
        String lastOne = letterGrades[letterGrades.length - 1];
        if (letter.equals(lastOne)){
            return percentRanges[percentRanges.length - 1] + 1;
        }
        //if invalid letter grade entered
        return 0.0;
    }
    
    public void calculateCourseMarks(){
        //Calculate a Course's marks in four different formats:
            //percentage
            //letter grade
            //grade points
            //Pass/Fail
        //Does not calculate percentage mark if the Course has been completed
        if (isComplete()){
            this.markPercent = this.letterToPercent(this.markLetter);   
        } else {
            this.setMarkPercent();
            this.setMarkLetter();
        }
        this.setGradePoints();
        this.setMarkStatus();
    }
    
    private void setMarkPercent(){
        //Sets a Course's percentage mark based on the Course Items a Course contains
        //Course percentage is defined out of 100% at all times - meaning that if a Course
        //contains one Assignment worth 2% and user recieved 10/10 on it, then Course
        //percent is represented by 100%, not 2%
        if (courseItems.size() == 0) {
            this.markPercent = 100;
        } else {
            double temp = 0, weight = 0;
            for (int i = 0; i < courseItems.size(); i++){
                CourseItem item =  courseItems.get(i);
                if (item.isMarked()) {
                    temp += (item.getStudentMark() / (item.getTotalMark())
                    * item.getWeight());
                    weight += item.getWeight();
                }
            }
            if (weight > 0.0) {
                this.markPercent = (temp / weight) * 100.0;
            } else {
                this.markPercent = 100.0;
            }
        }
    }
    
    private void setMarkLetter(){
        //Sets a Course's letter grade based on Course's percentage
        //Needs percentage mark to be defined to derive letter grade mark
        double mark = this.getMarkPercent();
        if (mark < this.percentRanges[0]) {
            this.markLetter = letterGrades[0];
        } else if (mark >= this.percentRanges[this.percentRanges.length - 1]) {
            this.markLetter =  letterGrades[letterGrades.length - 1];
        } else {
            for (int i = 0; i < this.percentRanges.length - 1; i++){
                if ((mark >= this.percentRanges[i]) && (mark < this.percentRanges[i+1])) {
                    this.markLetter = letterGrades[i+1];
                    break;
                }
            }
        }
    }
    
    private void setGradePoints() {
        //Sets a Course's grade points based on Course's letter grade and credits
        //Needs letter grade mark to be defined to determine grade points
        String letter = this.getMarkLetter();
        double gp = 0.0;
        if (letter.startsWith("A")){
            gp = 4;
        } else if (letter.startsWith("B")){
            gp = 3;
        } else if (letter.startsWith("C")){
            gp = 2;
        } else if (letter.startsWith("D")){
            gp = 1;
        } else {
            gp = 0;
        }
        if (letter.endsWith("+")){
            gp += 0.33;
        } else if (letter.endsWith("-")){
            gp -= 0.33;
        }
        this.gradePoints = gp * this.credits;
    }
    
    private void setMarkStatus(){
        //Sets a Course's status based on Course's letter grade
        //Needs letter grade to be defined to determine Pass or Fail status
        if (this.getMarkLetter().equals("F")){
            this.markStatus = "Fail";
        } else {
            this.markStatus = "Pass";
        }
    }
    
    public boolean editCourseItem(CourseItem item, String newLabel, double newStudentMark, double newTotalMark, double newWeight){
        //Edits given CourseItem with provided data if the new label doesn't already exist in linked list
        if (item.getLabel().equals(newLabel)){
            //editing mark information
            item.setStudentMark(newStudentMark);
            item.setTotalMark(newTotalMark);
            item.setWeight(newWeight);
            this.calculateCourseMarks();
            return true;
        } else {
            CourseItem itemExists = getCourseItem(newLabel);
            if (itemExists == null){
                //editing CourseItem label
                item.setLabel(newLabel);
                item.setStudentMark(newStudentMark);
                item.setTotalMark(newTotalMark);
                item.setWeight(newWeight);
                this.calculateCourseMarks();
                return true;
            } else {
                //item with new label already exists - can't edit
                return false;
            }
        }
    }
    
    public void setComplete(){
        //Accepts a boolean and sets Course to being finished or currently in progress
        this.complete = true;
    }
    
    public String getDepartment(){
        //Returns Course department name
        return this.department;
    }
    
    public int getNumber(){
        //Returns Course number
        return this.number;
    }
    
    public double getMarkPercent(){
        //Returns Course's percentage mark
        return this.markPercent;
    }
    
    public String getMarkLetter(){
        //Returns Course's letter grade mark
        return this.markLetter;
    }
    
    public double getGradePoints() {
        //Returns Course's grade points
        return this.gradePoints;
    }
    
    public String getMarkStatus(){
        //Returns Course's Pass/Fail Status
        return this.markStatus;
    }
    
    public double getCredits(){
        //Returns Course credits
        return this.credits;
    }
    
    public boolean isComplete(){
        //Returns if Course has been completed or not
        return this.complete;
    }
    
    public void displayCourse(){
        //Displays Course attributes
        this.calculateCourseMarks();
        System.out.println("[" + this.getDepartment() + " " + this.getNumber() + ", " +
                this.getCredits() + " Credits, " + Main.round(this.getMarkPercent(), 2) + "%, " +
                this.getMarkLetter() + ", " + this.getMarkStatus() + "]");
    }
    
    public void displayAllCourseItems(){
        //Displays all Course Items entered in a Course
        for (int i = 0; i < courseItems.size(); i++){
            CourseItem item =  courseItems.get(i);
            item.displayCourseItem();
        }
    }
           
    public void setDepartment(String department){
        //Sets Course's department name
        this.department = department.toUpperCase();
    }
    
    public void setNumber(int number){
        //Sets Course's number
        this.number = number;
    }
    
    public void setCredits(double credits){
        //Sets Course's credits
        this.credits = credits;
    }
    
    public Object[] predictMarks(String target){
        //Predicts marks for unmarked CourseItems with given letter grade and returns an Object array that
        //contains Course Items' student marks that should be achieved 
        Predictor predict = new Predictor(this.courseItems, this.percentRanges, target);
        return predict.calculatePredictions();
    }
    
    public double projectFinalMark(){
        //Projects and returns final percentage mark based on current performance
        Predictor predict = new Predictor(this.courseItems, this.percentRanges);
        return predict.predictOverall();
    }
            
}