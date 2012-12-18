/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * March 21, 2006
 * ======================================================
 * NOTE: This class is the interface for the HistoryManager
 * class
 */

package Features;

import School.Student;

public interface HistoryInterface {
    //an edit to a student object has been performed. Save the old object in case of undo
    public void studentEdited(Student old, String description);
    
    //undo an edit of a student object
    public Student undo(Student current);
    
    //redo an edit of a student object
    public Student redo(Student current);
    
    //return the number of undos available
    public int getNumUndos();
    
    //return the number of redos available
    public int getNumRedos();
    
    //if a change failed, discard the last undo
    public void changeFailed();
    
    //reset the history for a new student object
    public void reset();
    
    //method to get the description of the next undo
    public String getNextUndo();
    
    //method to get the description of the next redo
    public String getNextRedo();
    
}