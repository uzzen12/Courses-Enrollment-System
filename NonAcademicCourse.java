
/**
 * NonAcademicCourse class is the subclass of Course class.
 *
 * @author (Ujen Manandhar)
 * @version (1.0)
 */
public class NonAcademicCourse extends Course
{
    private String instructorName;// declaration of attributes
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    // creation of a constructor with parameters
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite)
    {
        super(courseID, courseName, duration);
        this.prerequisite = prerequisite;
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        isRegistered = false;
        isRemoved = false;
    }
    // accesor or getter method for each attribute  
    public String getInstructorName()
    {
        return this.instructorName;
    }
        
    public int getDuration()
    {
        return super.getDuration();
    }
        
    public String getStartDate()
    {
        return this.startDate;
    }
         
    public String getCompletionDate()
    {
        return this.completionDate;
    }
        
    public String getExamDate()
    {
        return this.examDate;
    }
        
    public String getPrerequisite()
    {
        return this.prerequisite;
    }
        
    public boolean getIsRegistered()
    {
        return this.isRegistered;
    }
        
    public boolean getIsRemoved()
    {
        return this.isRemoved;
    }
    //mutator or setter method of instructorName    
    public void setInstructorName(String instructorName)
    {
        if(isRegistered == false) {
            this.instructorName = instructorName;
        }
        else {
            System.out.println("It is not possible to change the instructor's name as the nonacademic course has already been registered");
        }
    }
    //method for registering non academic course     
    public void registerForNonAcademicCourse(String courseLeader, String instructorName, String startDate, String completionDate, String examDate)
    {
        if(isRegistered == false) {
            super.setCourseLeader(courseLeader);
            this.instructorName = instructorName;
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            isRegistered = true;
        }
        else {
            System.out.println("The non academic course has already been registered");
        }
    }
    //method for removing non academic course     
    public void removeFromNonAcademicCourse()
    {
        if(isRemoved == true) {
            System.out.println("The non academic course has already been removed");
        }
        else {
            super.setCourseLeader("");
            this.instructorName = "";
            this.startDate = "";
            this.completionDate = "";
            this.examDate = "";
            isRegistered = false;
            isRemoved = true;
        }
    }
    // display method    
    public void display()
    {
        super.display();
        if(isRegistered == true) {
            System.out.println("The name of the instructor is : " + this.instructorName);
            System.out.println("The starting date of this course is : " + this.startDate);
            System.out.println("The completion date of this course is : " + this.completionDate);
            System.out.println("The exam date for this course is : " + this.examDate);
        }
        else {
            System.out.println("The non academic course has not been registered yet");
        }
    }
}
