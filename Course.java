
/**
 * Course class is the parent class.
 *
 * @author (Ujen Manandhar)
 * @version (1.0)
 */
public class Course
{
    private String courseID;// declaration of attributes
    private String courseName;
    private String courseLeader;
    private int duration;
    
    public Course(String courseID, String courseName, int duration)// creation of a constructor with parameters
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        this.courseLeader = "";
    }
    // accesor or getter method for each attribute 
    public String getCourseID()
    {
        return this.courseID;
    }
        
    public String getCourseName()
    {
        return this.courseName;
    }
        
    public String getCourseLeader()
    {
        return this.courseLeader;
    }
        
    public int getDuration()
    {
        return this.duration;
    }
    //mutator or setter method for courseLeader    
    public void setCourseLeader(String courseLeader)
    {
        this.courseLeader = courseLeader;
    }
        
    public void display()// display method 
    {
        System.out.println("The ID for this course is : " + this.courseID);
        System.out.println("The name of this course is : " + this.courseName);
        System.out.println("The duration of this course is : " + this.duration + " years");
            
        if(this.courseLeader.equals("")) {
            System.out.println("Empty String");
        }
        else {
            System.out.println("The course leader for this course is : " + this.courseLeader);
        }   
            
    }
}