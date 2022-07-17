//inheriting child class with parents class
public class AcademicCourse extends Course{    
    //declaring the instance variable for the class
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessment;
    private boolean isRegistered;
    //declaring the constructor of the Academic class with six parameters
    public AcademicCourse(String courseID,String courseName,int duration, String level, String credit, 
    double NumberOfAssessment){ 
        super(courseID,courseName,duration);
        this.lecturerName="";
        this.level = level;
        this.credit = credit;
        startingDate = "";
        completionDate= "";
        this.numberOfAssessment = numberOfAssessment;
        isRegistered = false;
    } 
    //defining the getter method for each atttribute
    public String getLecturerName(){//returns the value to LecturerName as String data type
        return lecturerName;
    }
    public String getLevel(){//returns the value to level as String data type
        return level;
    }
    public String getCredit(){//returns the value to credit as String data type
        return credit;
    }
    public String getStartingDate(){//returns the value to startingDate as String data type
        return startingDate;
    }
    public String  getCompletionDate(){//returns the value to completiondate as String data type
        return completionDate;
    }
    public boolean getIsRegistered(){//returns the value to isRegistered as boolean data type
        return isRegistered;
    }
    public double getNumberOfAssessment(){//returns the value to numberOfAssment as String data type
        return numberOfAssessment;
    }
    //defining the setter method for LeturerName
    public void  setLecturerName (String lecturerName){
        this.lecturerName = lecturerName; //aasigns or sets the new value to the lecturerName
    }
    //defining the setter method for numberOfAssessment 
    public void  setNumberOfAssessment( int numberOfAssessment){
        this.numberOfAssessment = numberOfAssessment;   //aasigns or sets the new value to the numberOfAssessment
    }
    //method to check the register of leader 
    public void Registered(String courseLeader, String lecturerName, String StartingDate, String CompletionDate){
        if(isRegistered== true){
            System.out.println("The instructor name is " +lecturerName);
            System.out.println("The startingDate is "+startingDate);
            System.out.println("The completionDate is "+completionDate);
        }
        else{
            super.setCourseLeader(courseLeader);
            setLecturerName(lecturerName);
            this.startingDate = StartingDate;
            this.completionDate =CompletionDate;
            this.isRegistered = true;
        }
    }
    //method to display the registered lecturer name, level, credit, startingDate,completiondate   
    public void Display(){  
        super.Display();
        if(isRegistered==true){
            System.out.println("The name of the lecturer is "+lecturerName);
            System.out.println("The credit of the course is "+credit);
            System.out.println("The level of the course is "+level);
            System.out.println("The statringDate of the course is "+startingDate);
            System.out.println("The completionDate of the course is "+completionDate);
        }
    }
}