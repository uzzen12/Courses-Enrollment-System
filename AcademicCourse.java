
/**
 * AcademicCourse class is the subclass of Course class.
 *
 * @author (Ujen Manandhar)
 * @version (1.0)
 */
public class AcademicCourse extends Course
{
   private String lecturerName;// declaration of attributes
   private String level;
   private String credit;
   private String startingDate;
   private String completionDate;
   private int numberOfAssessments;
   private boolean isRegistered;
   // creation of a constructor with parameters
   public AcademicCourse(String courseID, String courseName, int duration, String level, String credit, int numberOfAssessments)
   {
       super(courseID, courseName, duration);
       this.level = level;
       this.credit = credit;
       this.numberOfAssessments = numberOfAssessments;
       this.lecturerName = "";
       this.startingDate = "";
       this.completionDate = "";
       this.isRegistered = false;
   }
   // accesor or getter method for each attribute    
    public String getLecturerName()
    {
        return this.lecturerName;
    }
        
    public String getLevel()
    {
        return this.level;
    }
        
    public String getCredit()
    {
        return this.credit;
    }
        
    public String getStartingDate()
    {
        return this.startingDate;
    }
        
    public String getCompletionDate()
    {
        return this.completionDate;
    }
        
    public int getNumberOfAssessments()
    {
        return this.numberOfAssessments;
    }
        
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
    //mutator or setter method of lecturerName    
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }
    //mutator or setter method of numberOfAssessments      
    public void setNumberOfAssessments(int numberOfAssessments)
    {
        this.numberOfAssessments = numberOfAssessments;
    }
    //method for registering academic course 
    public void registerForAcademicCourse(String courseLeader, String lecturerName, String startingDate, String completionDate)
    {
        if(isRegistered == true) {
            System.out.println("The name of the instructor is : " + this.lecturerName);
            System.out.println("The starting date is : " + this.startingDate);
            System.out.println("The completion date is : " + this.completionDate);
        }
        else {
            super.setCourseLeader(courseLeader);
            this.lecturerName=lecturerName;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            isRegistered = true;
        }
    }
    // display method
    public void display()
    {
        super.display();
        if(isRegistered == true) {
            System.out.println("The name of the lecturer is : " + this.lecturerName);
            System.out.println("Credit given for this course is : " + this.credit);
            System.out.println("The level of this course is : " + this.level);
            System.out.println("The starting date is : " + this.startingDate);
            System.out.println("The completion date is : " + this.completionDate);
            System.out.println("The total number of assessments are : " + this.numberOfAssessments);
        }
        else {
            System.out.println("The academic course has not been registered yet");
        }
    }
}
