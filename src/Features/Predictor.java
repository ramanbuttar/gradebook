/**
 * @author Balroop Singh Johal - 301004122
 * CMPT 275 - Team Blank
 * SFU Surrey Campus
 * March 24, 2006
 * ===============================
 *
 */

package Features;

import School.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Predictor{
    double total, remaining, target, targetLimit;
    int[] scheme;
    LinkedList<CourseItem> itemList = new LinkedList();
    LinkedList<Course> courseList = new LinkedList();
    ArrayList<Integer> arrList = new ArrayList();
    
    public Predictor(LinkedList<CourseItem> iList, double[] markingScheme, String wanted){
        copyList(iList); //Create deep copy of Linked List
        findTarget(wanted, markingScheme); //Derive numerical value of target based on letter grade
    }
    
    public Predictor(LinkedList<CourseItem> iList, double[] markingScheme){
        copyList(iList);
    }
    
    public Predictor(LinkedList<Course> cList){
        populateCourseList(cList);
    }
    
    //Project the Semester's GPA
    public double projectGPA(){
        Semester tempSem = new Semester("Fall", 2000);
        //Populate the semester with courses
        for(int i = 0; i<this.courseList.size(); i++){
            tempSem.addCourse(this.courseList.get(i));
        }
        return tempSem.getGPA(); //return the projected GPA
    }
    
    public Object[] calculatePredictions(){
        //Check if the mark is achievable
        if((checkTotals(this.target) == false) || (checkOver(this.targetLimit) == false)){
            return null; //Return unchanged list if impossible
        } else{ //Proceed to make predictions if mark can be achieved
            findOffset(); //Set the Marks
            return getMarks(); //Return the updated list
        }
    }
    
    //Copy item list into predictor
    private void copyList(LinkedList<CourseItem> list){
        for(int i=0; i<list.size(); i++){
            CourseItem newItem = new CourseItem(list.get(i));
            this.itemList.add(newItem);
        }
    }
    
    //Copy courses into courseList
    private void populateCourseList(LinkedList<Course> list){
        for(int i=0; i<list.size(); i++){
            //Add copy of course to list if course is completed
            if(list.get(i).isComplete() == true){
                Course temp = new Course(list.get(i));
                courseList.add(temp);
            }
            //Create new course with projected final mark if course is not completed
            else{
                //Find Projected Final Mark
                double projected = list.get(i).projectFinalMark();
                //Convert Percentage to Letter grade to be used in constructor
                String grade = gradeConverter(projected, list.get(i).getPercentRange());
                //Create new course
                Course temp =  new Course(list.get(i).getDepartment(), list.get(i).getNumber(), list.get(i).getCredits(), grade);
                courseList.add(temp); //add to list
            }
        }
    }
    
    //Check if it is possible to achieve the desired mark
    private boolean checkTotals(double target){
        double mark, outOf, weight;
        //Add up the weights of each courseItem
        for(int i=0; i<this.itemList.size(); i++){
            //Determine the overall percentage already attained
            if(this.itemList.get(i).isMarked() == true){
                mark = itemList.get(i).getStudentMark();
                outOf = itemList.get(i).getTotalMark();
                weight = itemList.get(i).getWeight();
                this.total += (mark/outOf)*weight;
            }
            
            //Determine how much percent still remains in the course
            else{
                this.remaining += this.itemList.get(i).getWeight();
                arrList.add(i); //Add index to array list for faster access
            }
        }
        if((this.total+this.remaining) < this.target){
            return false; //return false if the desired mark is impossible to achieve
        } else{
            return true; //return true if desired mark is possible
        }
        
    }
    
    //Check if current mark is too far over target grade
    private boolean checkOver(double targetLimit){
        //If the current mark is over the target grade return false, otherwise return true
        if(this.total >= targetLimit){
            return false;
        } else{
            return true;
        }
    }
    
    //Find offset
    public void findOffset(){
        int outerLoops = 0;
        boolean found = false;
        double needed = this.target - this.total;
        int workingWeight = 0;
        
        for(int h=0; h<=100; h++){
            workingWeight = 0; //re-initialize weight
            for(int i=0; i<this.arrList.size(); i++){
                CourseItem temp = this.itemList.get(arrList.get(i));
                if(h < temp.getWeight()){
                    workingWeight += h; //add h% to working weight
                    
                } else{
                    workingWeight += temp.getWeight();
                }
                if(workingWeight >= needed){
                    found = true;
                }
            }
            if(found == true){
                outerLoops = h;
                break;
            }
            
        }
        setMarks(outerLoops);
        
    }
    
    //Set incomplete Marks
    private void setMarks(int h){
        for(int i=0; i<this.arrList.size(); i++){
            CourseItem temp = itemList.get(arrList.get(i));
            double pointVal = temp.getWeight()/temp.getTotalMark(); //Determine the overall percent value of each mark
            double mark = h/pointVal; //Calculate Mark
            if(mark < temp.getTotalMark()){
                temp.setStudentMark(h/pointVal); //set the predicted mark
            } else{
                temp.setStudentMark(temp.getTotalMark()); //set predicted mark
            }
            
        }
        
    }
    
    //Find target percent value
    private void findTarget(String lGrade, double[] markingScheme){
        if(lGrade.equals("F")){
            this.target = 0;
            this.targetLimit = markingScheme[0];
        }
        if(lGrade.equals("D")){
            this.target = markingScheme[0];
            this.targetLimit = markingScheme[1];
        }
        if(lGrade.equals("C-")){
            this.target = markingScheme[1];
            this.targetLimit = markingScheme[2];
        }
        if(lGrade.equals("C")){
            this.target = markingScheme[2];
            this.targetLimit = markingScheme[3];
        }
        if(lGrade.equals("C+")){
            this.target = markingScheme[3];
            this.targetLimit = markingScheme[4];
        }
        if(lGrade.equals("B-")){
            this.target = markingScheme[4];
            this.targetLimit = markingScheme[5];
        }
        if(lGrade.equals("B")){
            this.target = markingScheme[5];
            this.targetLimit = markingScheme[6];
        }
        if(lGrade.equals("B+")){
            this.target = markingScheme[6];
            this.targetLimit = markingScheme[7];
        }
        if(lGrade.equals("A-")){
            this.target = markingScheme[7];
            this.targetLimit = markingScheme[8];
        }
        if(lGrade.equals("A")){
            this.target = markingScheme[8];
            this.targetLimit = markingScheme[9];
        }
        if(lGrade.equals("A+")){
            this.target = markingScheme[9];
            this.targetLimit = 100;
        }
    }
    
    //Convert percentage to letter grade
    private String gradeConverter(double percent, double[] scheme){
        if(percent < scheme[0]){
            return "F";
        }
        else if((percent >= scheme[0]) && (percent < scheme[1])){
            return "D";
        }
        else if((percent >= scheme[1]) && (percent < scheme[2])){
            return "C-";
        }
        else if((percent >= scheme[2]) && (percent < scheme[3])){
            return "C";
        }
        else if((percent >= scheme[3]) && (percent < scheme[4])){
            return "C+";
        }
        else if((percent >= scheme[4]) && (percent < scheme[5])){
            return "B-";
        }
        else if((percent >= scheme[5]) && (percent < scheme[6])){
            return "B";
        }
        else if((percent >= scheme[6]) && (percent < scheme[7])){
            return "B+";
        }
        else if((percent >= scheme[7]) && (percent < scheme[8])){
            return "A-";
        }
        else if((percent >= scheme[8]) && (percent < scheme[9])){
            return "A";
        }
        else{
            return "A+";
        }
    }
    
    public Object[] getMarks(){
        Object[] arr = new Object[itemList.size()];
        for (int i = 0; i < itemList.size(); i++){
            CourseItem item = itemList.get(i);
            String data = "" + item.getStudentMark();
            arr[i] = data;
        }
        return arr;
    }
    
    public double predictOverall(){
        double sum = 0;
        double avg = 0;
        int unmarked = 0;
        for(int i=0; i<itemList.size(); i++){
            CourseItem temp = itemList.get(i) ;
            if(temp.isMarked() == true){
                sum += (temp.getStudentMark()/temp.getTotalMark())*100;
            } else{
                unmarked++;
            }
        }
        avg = sum/(itemList.size()-unmarked);
        
        return avg;
    }
}