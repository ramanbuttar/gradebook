/**
 * @author Bryan Chan - 301004467
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * February 8, 2006
 * ===============================
 * NOTE: This class defines the student objects
 *
 */

package School;
import Features.GPAchart;
import Features.GradeGraph;
import GUI.Main;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.LinkedList;

public class Student implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String fName, lName, userID, password;
    private long studNumber;
    private double CGPA;
    private LinkedList<Semester> semesterList = new LinkedList();
    
    public Student(String fName, String lName, long studNumber, String userID, String password) {
        //Constructor
        this.fName = fName;
        this.lName = lName;
        this.studNumber = studNumber;
        this.userID = userID;
        this.password = password;
        this.CGPA = 0.0;
    }
    
    public Student(Student src) {
        //copy constructor
        this.fName = src.getFName();
        this.lName = src.getLName();
        this.studNumber = src.getStudNumber();
        this.userID = src.getUserID();
        this.password = src.getPassword();
        
        Semester cpy;
        //copy all semesters into the new student object
        for(int i=0; i<src.getNumSemesters(); i++) {
            cpy = new Semester(src.getSemesterIndex(i));
            this.addSemester(cpy);
        }
        this.calcCGPA();
    }
    
    public Object[] getSemesterData(){
        //Returns an Object array that contains String arrays for each Semester that hold the data to be displayed
        this.calcCGPA();
        Object[] arr = new Object[semesterList.size()];
        for (int i = 0; i < semesterList.size(); i++){
            Semester sem = semesterList.get(i);
            String[] data = new String[]{sem.getSeason(), "" + sem.getYear(),
            "" + Main.round(sem.getGPA(), 2)};
            arr[i] = data;
        }
        return arr;
    }
    
    //setters
    public void setFName(String name) {
        //Sets student's first name to given string
        this.fName = name;
    }
    
    public void setLName(String name) {
        //Sets student's last name to given string
        this.lName = name;
    }
    
    public boolean setStudNumber(long studNumber) {
        //Sets student's student number to given number
        //Returns a boolean according to if valid student number was set or not
        if (studNumber > 0) {
            this.studNumber = studNumber;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean changePassword(String oldPass, String newPass){
        //Changes profile password to given password
        //Returns boolean according its success
        if (oldPass.equals(this.getPassword())){
            this.password = newPass;
            return true;
        } else {
            return false;
        }
    }
    
    public String[] getAllSemesterNames(){
        //Returns a String array of all Semester names
        String[] arr = new String[semesterList.size()];
        for(int i=0; i<semesterList.size(); i++){
            String name = semesterList.get(i).getSeason();
            name += " ";
            name += semesterList.get(i).getYear();
            arr[i] = name;
        }
        return arr;
    }
    
    //getters
    public String getFName() {
        //Returns student's first name
        return this.fName;
    }
    
    public String getLName() {
        //Returns student's last name
        return this.lName;
    }
    
    public long getStudNumber() {
        //Returns student's student number
        return this.studNumber;
    }
    
    public double getCGPA() {
        //Returns student's CGPA
        calcCGPA();
        return CGPA;
    }
    
    public String getUserID(){
        //Returns student's user id
        return this.userID;
    }
    
    public String getPassword(){
        //Returns student's password
        return this.password;
    }
    
    private void sortSemesters(){
        //Use selection sort to sort semesters according to semester code
	for(int i = 0; i < semesterList.size()-1; i++){
		int smallest = i;
		for(int j = i + 1; j < semesterList.size(); j++){
                    int currentCode = semesterList.get(j).getCode();
                    int smallestCode = semesterList.get(smallest).getCode();
			if(currentCode < smallestCode){
				smallest = j;
			}
		}
		// Swap the smallest with the current item
		Semester temp = semesterList.get(i);
		semesterList.set(i, semesterList.get(smallest));
		semesterList.set(smallest, temp);
	}
        
    }
    
    public boolean addSemester(Semester sem){
        //Adds given semester to student
        Semester semExists = getSemester(sem.getSeason(), sem.getYear());
        if (semExists == null){ //new Semester doesn't exist
            semesterList.add(sem);
            sortSemesters();
            this.calcCGPA();
            return true;
        } else {
            return false;
        }
    }
    
    public boolean removeSemester(String season, int year){
        //Removes semester from student
        //Returns true if found and removed from list, false otherwise
        Semester toRemove = getSemester(season, year);
        if(toRemove != null){
            semesterList.remove(toRemove);
            this.calcCGPA();
            return true;
        }//end if
        return false;
    }
    
    public Semester getSemester(String season, int year){
        //Retreives a semester object if it exists, otherwise returns NULL.
        for(int i=0; i<semesterList.size(); i++){
            Semester currentSemester = semesterList.get(i);
            if((season.equals(currentSemester.getSeason())) && (year == currentSemester.getYear())){
                return currentSemester;
            }//end if
        }//end for
        return null;
    }
    
    public Semester getSemesterIndex(int i){
        //Allows a course to be retrieved directly by its index
        if (i >= 0 && i< semesterList.size()) {
            return semesterList.get(i);
        } else { //index out of bounds
            return null;
        }
    }
    
    public int getNumSemesters() {
        //Returns the number of semesters currently in the student
        return semesterList.size();
    }
    
    public void displayAllSemeters(){
        //Displays all the semester added to the student.
        for(int i=0; i<semesterList.size(); i++){
            Semester currentSemester = semesterList.get(i);
            currentSemester.displaySemester();
        }//end for
    }
    
    public BufferedImage drawGPAChart(){
        //Plots GPA data and returns BufferedImage
        Double[] gpa = this.getSemesterGPAs();
        String[] names = this.getAllSemesterNames();
        GPAchart chart = new GPAchart(names, gpa, this.getCGPA());
        chart.plotData();
        return chart.getImage();
    }
    
    public BufferedImage drawGradesGraph(){
        //Plots letter grades data and returns BufferedImage
        int[] grades = new int[11];
        for(int i = 0; i<semesterList.size(); i ++){
            int[] temp = semesterList.get(i).getMarks();
            for(int j=0; j<11; j++){
                grades[j] += temp[j];
            }
        }
        GradeGraph graph = new GradeGraph(grades);
        graph.plotData();
        return graph.getImage();
    }    
    
    public boolean editSemester(Semester sem, String newSeason, int newYear){
        //Changes given semester's attributes to provided data
            //if given semester exists in list and
            //new attributes do not cause a conflict with another semester in list
        if ((sem.getSeason().equals(newSeason)) && (sem.getYear() == newYear)){
            //not editing anything
            return true;
        } else {
            Semester semExists =  getSemester(newSeason, newYear);
            if(semExists == null){
                //editing Semester's season and year
                sem.setSeason(newSeason);
                sem.setYear(newYear);
                sem.codeGenerator(newSeason, newYear);
                sortSemesters();
                return true;
            }  else {
                //Semester already exists - can't edit
                return false;
            }
        }
    }
    
    private Double[] getSemesterGPAs(){
        //Returns a double array of all semester GPAs
        Double[] arr = new Double[semesterList.size()];
        for (int i = 0; i <semesterList.size(); i++){
            double gpa = semesterList.get(i).getGPA();
            arr[i] = gpa;
        }
        return arr;
    }
    
    public void calcCGPA(){
        //Calculates the CGPA of student
        double credits = 0, gradePoints = 0;
        for(int i=0; i < semesterList.size(); i++){
            Semester currentSemester = semesterList.get(i);
            credits += currentSemester.getCredits();
            gradePoints += currentSemester.getGradePoints();
        }//end for
        if (credits != 0.0){
            this.CGPA = gradePoints / credits;
        } else {
            this.CGPA = 0.0;
        }
    }
    
    public void displayStudentInfo(){
        //Prints out all fname, lname, studentNumber and CGPA of a student
        System.out.println("[" + this.getFName() + " " + this.getLName() + ", #" +
                this.getStudNumber() + ", CGPA: " + Main.round(this.getCGPA(), 3) + "]");
    }
}
