import School.Course;
import School.CourseItem;
import junit.framework.TestCase;
   
public class PredictorTest extends TestCase{
    Course course1 = new Course("CMPT", 275, 4.00);
    CourseItem item1 = new CourseItem("Assignment 1", 10, 20, 10);
    CourseItem item2 = new CourseItem("Assignment 2", 20, 20, 10);
    CourseItem item3 = new CourseItem("Assignment 3", 10, 20, 30);
    CourseItem item4 = new CourseItem("Assignment 4", 20, 25);
    CourseItem item5 = new CourseItem("Assignment 5", 20, 25);
    
    public void testcalculatePredictions(){
        course1.addCourseItem(item1);
        course1.addCourseItem(item2);
        course1.addCourseItem(item3);
        course1.addCourseItem(item4);
        course1.addCourseItem(item5);
        Object[] arr = course1.predictMarks("D");
        
        for(int i=0; i<5; i++){
            if(i==0){
                assertEquals("Mark 1 should be 10", "10.0", arr[i]);
            }
            else if(i==1){
                assertEquals("Mark 2 should be 20", "20.0", arr[i]);
            }
            else if(i==2){
                assertEquals("Mark 3 should be 10", "10.0", arr[i]);
            }
            else if(i==3){
                assertEquals("Mark 4 should be 8", "8.0", arr[i]);
            }
            else if(i==4){
                assertEquals("Mark 5 should be 8", "8.0", arr[i]);
            }
            
        }
                
    }
    
    public void testpredictOverall(){
        course1.addCourseItem(item1);
        course1.addCourseItem(item2);
        course1.addCourseItem(item3);
        double avg = course1.projectFinalMark();
        
        assertEquals("AVG should be 66.666666666666667", 66.666666666666667, avg);
        
        
    }
        
}
    
