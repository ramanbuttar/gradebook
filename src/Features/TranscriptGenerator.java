/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * March 14, 2006
 * ======================================================
 * NOTE: This class is responsible for creating the text file
 * outputted transcripts.
 */
package Features;

import School.*;
import java.io.*;

public class TranscriptGenerator {
    //global file output writer
    static PrintWriter out;
    
    private static final String defaultSaveLocation = "Storage\\Transcripts\\";
    
    public static void saveTranscript(Student currentStudent, String fname)
    throws FileNotFoundException {//export the transcript to a file
        
        if (currentStudent != null) {
            if (fname == null)
                fname = defaultSaveLocation + "temp.txt";
            else if (!fname.contains(".txt"))
                fname = fname + ".txt";
            
            //open file for saving
            File outfile = new File(fname);
            out = new PrintWriter(outfile);
            
            //output the transcript
            printHeader();
            printStudentInfo(currentStudent);
            
            int numSemesters = currentStudent.getNumSemesters();
            if (numSemesters != 1)
                out.println("SEMESTER BREAKDOWN (Total: "
                        + currentStudent.getNumSemesters()
                        + " semesters in student record)");
            else
                out.println("SEMESTER BREAKDOWN (Total: "
                        + currentStudent.getNumSemesters()
                        + " semester in student record)");
            
            printSepLine();
            
            //output semesters
            for (int a = 0; a < numSemesters; a++) {
                printSemester(currentStudent.getSemesterIndex(a));
            }
            printSepLine();
            out.println("                            - end of transcript -");
            out.close();
        }
    }
    
    public static void printTranscript(Student currentStudent) {
        new PrintableTranscript(currentStudent);
    }
    
    private static void printSemester(Semester sem) {//print all courses contained in the semester
        out.println(sem.getSeason().toUpperCase() + " " + sem.getYear() + " ("
                + sem.getCode() + ") ");
        out.println("   Dept  Number  Credits  Grade  Percentage");
        for (int i = 0; i < sem.getNumCourses(); i++) {
            printCourse(sem.getCourseIndex(i));
        }
        out.println("");
    }
    
    private static void printCourse(Course crse) {//prints all the attributes of a single course
        out.println("   " + crse.getDepartment() + "  " + crse.getNumber()
        + "     " + crse.getCredits() + "      " + crse.getMarkLetter()
        + "     " + crse.getMarkPercent() + "%");
        
    }
    
    private static void printHeader() {//print the header of the file
        out
                .println("                P R O J E C T  N U L L  -  T R A N S C R I P T                ");
        out
                .println("==============================================================================");
    }
    
    private static void printStudentInfo(Student curr) {//print the student's attributes
        out.print("NAME: ");
        out.print(curr.getLName() + ", " + curr.getFName());
        out.print("                                ");
        out.println("STUDENT ID: " + curr.getStudNumber());
        printSepLine();
        out.println("User ID: " + curr.getUserID());
        out.println("Current CGPA: " + curr.getCGPA());
        printSepLine();
    }
    
    private static void printSepLine() {
        out
                .println("------------------------------------------------------------------------------");
    }
    
}
