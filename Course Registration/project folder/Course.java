//Creating class Course
public class Course {
    //declaring the instance variable for the class
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    //defining the parameterized Constructor with three parameters
    public Course(String courseID, String courseName, int duration) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseLeader = "";
        this.duration = duration;
    }
    //defining the getter method for each attributes
    public String getCourseID(){//returns the value to courseID as String data type
        return courseID;
    }
    public String getCourseName(){//returns the value to courseName as String data type
        return courseName;
    }
    public String getCourseLeader(){//returns the value to courseLecturer as String data type
        return courseLeader;
    }
    public int getDuration(){//returns the value to duration as int data type
        return duration;
    }
    //defining the setter method for courseLeader
    public void setCourseLeader(String courseLeader){
        this.courseLeader = courseLeader; //aasigns or sets the new value to the courseLeader
    }
    //method to display the courseID, courseName, duration and courseleader if course leader is no empty String 
    public void Display(){
        System.out.println("The courseID is "+courseID);
        System.out.println("The cousrseName is "+courseName);
        System.out.println("The courseDuration is "+duration);
        if(courseLeader !=("")){
            System.out.println("The course leader is "+courseLeader);
        }
    }
}
