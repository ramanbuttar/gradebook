/**
 * @author Balroop Sing Johal - #301004122
 * CMPT 275 - Team Blank
 * SFU Surrey Campus
 * February 6, 2006
 * ===============================
 */

package School;

import Features.Predictor;
import GUI.Main;
import java.io.Serializable;
import java.util.LinkedList;
import School.Course;

public class Semester implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String season;
    private int code, year;
    private double gpa, gradePoints, credits;
    private LinkedList<Course> courseList = new LinkedList();
    
    public Semester(String season, int year){
        //Constructor
        this.season = season;
        this.year = year;
        codeGenerator(season, year);
    }
    
    public Semester(Semester src) {
    	//Copy constructor
        this.season = src.getSeason();
        this.year = src.getYear();
        this.code = src.getCode();
        this.gpa = src.getGPA();
        this.gradePoints = src.getGradePoints();
        this.credits = src.getCredits();
        
        //copy all courses into the list
        Course cpy;
        for(int i=0; i<src.getNumCourses(); i++) {
            cpy = new Course(src.getCourseIndex(i));
            this.addCourse(cpy);
        }
    }
    
    public void codeGenerator(String season, int year){
    	//Generates and sets semester code based on season and year
        String s = "";
        if(year>2000){
            s = "1";
        }
        String y = String.valueOf(year);
        s += y.substring(2,4);
        if(season.equals("Spring")){
            s += "1";
        } else if (season.equals("Summer")){
            s += "4";
        } else{
            s += "7";
        }
        
        this.code = Integer.parseInt(s);
    }
    
    public boolean addCourse(Course course){
        //Add course to semester's course list
        if(getCourse(course.getDepartment(), course.getNumber()) == null){
            courseList.add(course);
            this.calcGPA();
            return true;
        } else {
            return false;
        }
    }
    
    public boolean editCourse(Course course, String newDept, int newNum, double newCredits){
    	//Edit given course with provided attributes
    		//if given course exists in list and
    		//if provided attributes don't cause a conflict with another course in list
        if ((course.getDepartment().equals(newDept)) && (course.getNumber() == newNum)) {
            //editing Course credits
            course.setCredits(newCredits);
            this.calcGPA();
            return true;
        } else {
            Course courseExists = getCourse(newDept, newNum);
            if(courseExists == null){
                //editing Course department and numbber
                course.setDepartment(newDept);
                course.setNumber(newNum);
                course.setCredits(newCredits);
                this.calcGPA();
                return true;
            } else {
                //semester already exists - can't edit
                return false;
            }
        }
    }
    
    public Object[] getCourseData(){
    	//Returns an Object array that contains String arrays for each Course that hold the data to be displayed
        this.calcGPA();
        Object[] arr = new Object[courseList.size()];
        for (int i = 0; i < courseList.size(); i++){
            Course course = courseList.get(i);
            String[] data = new String[]{course.getDepartment(), "" + course.getNumber(),
            "" + Main.round(course.getMarkPercent(), 2), course.getMarkLetter(),
            "" + course.isComplete()};
            arr[i] = data;
        }
        return arr;
    }
    
    public boolean removeCourse(String dept, int num){
        //Removes course from semester's course list
    	//Returns true if the course found and removed, false if course not found.
        Course course = getCourse(dept, num);
        if (course != null) {
            courseList.remove(course);
            calcGPA();
            return true;
        } else {
            return false;
        }
        
    }
    
    public Course getCourse(String dept, int num){
        //Check if course is in semester's course list
    	//Returns course if in list, null if not
        for(int i = 0; i<courseList.size(); i ++){
            Course course = courseList.get(i);
            if ((dept.toUpperCase().equals(course.getDepartment())) &&
                    (num == course.getNumber())){
                calcGPA();
                return course;
            }
        }
        return null;
        
    }
    
    public Course getCourseIndex(int i){
        //Allows a course to be retrieved directly by its index
        if (i >= 0 && i< courseList.size()) {
            return courseList.get(i);
        } else {//index out of bounds
            return null;
        }
    }
    
    public int getNumCourses() {
        //Returns the number of courses in the semester
        return courseList.size();
    }
    
    public void displayAllCourses(){
        //Displays all Courses entered in a Semester
        for(int i = 0; i<courseList.size(); i ++){
            Course course = courseList.get(i);
            course.displayCourse();
        }
    }
    
    public void displaySemester(){
        //Displays Semester attributes
        System.out.println("[" + this.getSeason() + " " + this.getYear() + " " +
                "(" + this.getCode() + "), " + "GPA: " + Main.round(this.getGPA(), 3) + "]");
    }
    
    public void calcGPA(){
        //Calculates GPA
        if (courseList.size() == 0){
            this.gpa = 0;
        } else {
            this.setCredits();
            this.setGradePoints();
            this.gpa = this.getGradePoints() / this.getCredits();
        }
    }
    
    
    //Setters
    public void setSeason(String ssn){
    	//Sets Semester season to provided string
        this.season = ssn;
    }
    
    public void setYear(int yr){
    	//Sets Semester year to provided integer
        this.year = yr;
    }
    
    private void setCredits(){
    	//Sets Semester credits based on credits of entered courses
        double credits = 0;
        for(int i = 0; i < courseList.size(); i++){
            Course course =  courseList.get(i);
            credits += course.getCredits();
        }
        this.credits = credits;
    }
    
    private void setGradePoints(){
    	//Sets Semester grade points based on letter grades of entered courses
        double gradePoints = 0;
        for(int i = 0; i < courseList.size(); i++){
            Course course =  courseList.get(i);
            gradePoints += course.getGradePoints();
        }
        this.gradePoints = gradePoints;
    }
    
    public int[] getMarks(){
    	//Tallys final letter grades of entered courses
    	//Returns an integer array
        int[] gradeArr = new int[11];
        for(int i = 0; i<courseList.size(); i ++){
            if((courseList.get(i).getMarkLetter()).equals("F")){
                gradeArr[0]++;
            } else if((courseList.get(i).getMarkLetter()).equals("D")){
                gradeArr[1]++;
            } else if((courseList.get(i).getMarkLetter()).equals("C-")){
                gradeArr[2]++;
            } else if((courseList.get(i).getMarkLetter()).equals("C")){
                gradeArr[3]++;
            } else if((courseList.get(i).getMarkLetter()).equals("C+")){
                gradeArr[4]++;
            } else if((courseList.get(i).getMarkLetter()).equals("B-")){
                gradeArr[5]++;
            } else if((courseList.get(i).getMarkLetter()).equals("B")){
                gradeArr[6]++;
            } else if((courseList.get(i).getMarkLetter()).equals("B+")){
                gradeArr[7]++;
            } else if((courseList.get(i).getMarkLetter()).equals("A-")){
                gradeArr[8]++;
            } else if((courseList.get(i).getMarkLetter()).equals("A")){
                gradeArr[9]++;
            } else if((courseList.get(i).getMarkLetter()).equals("A+")){
                gradeArr[10]++;
            }
        }
        return gradeArr;
    }
    
    //Getters
    public String getSeason(){
    	//Returns Semester season
        return this.season;
    }
    
    public int getYear(){
    	//Returns Semester year
        return this.year;
    }
    
    public double getGPA(){
    	//Returns Semester GPA
        calcGPA();
        return gpa;
    }
    
    public int getCode(){
    	//Returns Semester code
        return this.code;
    }
    
    public double getCredits(){
    	//Returns Semester's total credits
        return this.credits;
    }
    
    public double getGradePoints(){
    	//Returns Semester's grade points
        return this.gradePoints;
    }

    public double projectGPA(){
	//Returns projected GPA for this semester
        Predictor predict = new Predictor(this.courseList);
        return predict.projectGPA();
    }
}