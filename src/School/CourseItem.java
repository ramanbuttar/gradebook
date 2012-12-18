/**
 * @author Raman Buttar - 301007414
 * CMPT 275 - Team Blank
 * SFU Surrey Campus
 * February 6, 2006
 * ===============================
 * NOTE: This class defines the CourseItem objects
 *
 */

package School;

import java.io.Serializable;

public class CourseItem implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String label;
    private double studentMark, totalMark, weight;
    private boolean marked;
    
    public CourseItem(String label, double studentMark, double totalMark, double weight) {
        //Constructor for Marked CourseItems, where student mark is specified
        this.label = label;
        this.studentMark = studentMark;
        this.totalMark = totalMark;
        this.weight = weight;
        this.marked = true;
    }
    
    public CourseItem(String label, double totalMark, double weight) {
        //Constructor for Unmarked CourseItems, where student mark is set to 0.0 by default
        this.label = label;
        this.studentMark = 0.0;
        this.totalMark = totalMark;
        this.weight = weight;
        this.marked = false;
    }
    
    public CourseItem(CourseItem src) {
        //copy constructor.
        this.label = src.getLabel();
        this.studentMark = src.getStudentMark();
        this.totalMark = src.getTotalMark();
        this.weight = src.getWeight();
        this.marked = src.isMarked();
    }
    
    public void setLabel(String label){
        //Accepts a String and sets new label for an existing Course Item
        this.label = label;
    }
    
    public void setStudentMark(double studentMark){
        //Sets student's achieved mark for an existing Course Item
        this.studentMark = studentMark;
    }
    
    public void setTotalMark(double totalMark){
        //Sets the total mark for an existing Course Item
        this.totalMark = totalMark;
    }
    
    public void setWeight(double weight){
        //Sets the weight for an existing Course Item
        this.weight = weight;
    }
    
    public void setMarked(boolean bool){
        //Sets whether the item is complete or not
        this.marked = bool;
    }
    
    public String getLabel(){
        //Returns a String that represents Course Item's label
        return this.label;
    }
    
    public double getStudentMark(){
        //Returns student's achieved mark for a Course Item
        return this.studentMark;
    }
    
    public double getTotalMark(){
        //Returns the total mark for a Course Item
        return this.totalMark;
    }
    
    public double getWeight(){
        //Returns the weight for a Course Item
        return this.weight;
    }
    
    public boolean isMarked(){
        //Returns the status of the items completeness
        return this.marked;
    }
    
    public void displayCourseItem(){
        //Displays a Course Item's information
        System.out.println("(" + this.label + ", " + this.studentMark + "/" +
                this.totalMark + ",  Worth: " +
                this.weight + "%)");
    }
}