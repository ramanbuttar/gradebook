/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * March 20, 2006
 * ======================================================
 * NOTE: This class is responsible for managing the history
 * of changes to the student object and its related classes.
 */

package Features;

import java.util.Stack;
import School.Student;


public class HistoryManager implements HistoryInterface {
    private Student currentStudent;
    
    private Stack<Student> undos = new Stack();
    private Stack<Student> redos = new Stack();
    private Stack<String> undoDescriptions = new Stack();
    private Stack<String> redoDescriptions = new Stack();
    
    public HistoryManager() {//constructor
        undos.clear();
        redos.clear();
        undoDescriptions.clear();
        redoDescriptions.clear();
    }
    
    public void studentEdited(Student old, String description) {//a change has been made to the student object, save it for possible undo
        
        //copy the old student and store it in undos
        Student cpy_old = new Student(old);
        
        undos.push(cpy_old);
        
        //save the description
        undoDescriptions.push(description);
        
        //element changed, you cannot redo anymore
        redos.clear();
        redoDescriptions.clear();
    }
    
    public Student undo(Student current) {//undo was called, reload the saved student object
        
        //copy the current student and store it in redos
        Student cpy_newer = new Student(current);
        
        redos.push(cpy_newer);
        redoDescriptions.push(undoDescriptions.pop());
        
        //pop the older student from undo
        currentStudent = undos.pop();
        
        return currentStudent;
    }
    
    public Student redo(Student current) {//redo was called, reload the newer student object
        
        //copy the current student and store it in undo
        Student cpy_older = new Student(current);
        
        undos.push(cpy_older);
        undoDescriptions.push(redoDescriptions.pop());
        
        //pop the newer student from redo
        currentStudent = redos.pop();
        
        return currentStudent;
        
    }
    
    public int getNumUndos() {//return the number of undos remaining
        return undos.size();
    }
    
    public int getNumRedos() {//return the number of redos remaining
        return redos.size();
    }
    
    public void changeFailed() {//the edit has failed, pop the last undo off.
        undos.pop();
        undoDescriptions.pop();
    }
    
    public void reset() {//clear both stacks
        undos.clear();
        redos.clear();
        undoDescriptions.clear();
        redoDescriptions.clear();
    }
    
    public String getNextUndo() {//method to get the next undo
        if(undoDescriptions.size() > 0)
            return "Undo: " + undoDescriptions.peek();
        else
            return "Undo: None";
    }
    
    public String getNextRedo() {//method to get the next redo
        if(redoDescriptions.size() > 0)
            return "Redo: " + redoDescriptions.peek();
        else
            return "Redo: None";
    }
}
