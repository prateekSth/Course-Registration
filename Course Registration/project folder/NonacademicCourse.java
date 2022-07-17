//inheriting child class with parents class
public class NonacademicCourse extends Course{
    //declaring the instance variable for the class
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    //declaring the constructor of the Academic class with six parameters
    public NonacademicCourse(String courseId, String courseName, int duration, String prerequisite){
       super( courseId ,courseName, duration);
       this.prerequisite=prerequisite;
       startDate="";
       completionDate="";
       examDate="";
       isRegistered=false;
       isRemoved=false;
    }
    //defining the getter method for each atttribute
    public String getInstructorName(){//returns the value to InstructorName as String data type
        return instructorName;
    }
    public String getStartDate(){//returns the value to StartDate as String data type
        return startDate;
    }
    public String getCompletionDate(){//returns the value to CompletionDate as String data type
        return completionDate;
    }
    public String getExamDate(){//returns the value to ExamDate as String data type
        return examDate;
    }
    public String getprerequisite(){//returns the value to prerequisite as String data type
        return prerequisite;
    }
    public boolean getIsRegistered(){//returns the value to getIsRegistered as Boolean data type
        return isRegistered;
    }
    public boolean getIsRemoved(){//returns the value to getIsRemoved as Boolean data type
        return isRemoved;
    }
    //creating new method to set new value to instructorName
    public void setInstructorName(String instructorName){
        if(isRegistered==false){
            this.instructorName=instructorName;
        }
        else{
            System.out.println("This course is already registered so, the instructor's name cannot be changed");
        }
    }
    //creating register method with four parameters
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate){
        if(isRegistered==false){
            setInstructorName(instructorName);
            super.setCourseLeader(courseLeader);
            this.startDate=startDate;
            this.completionDate=completionDate;
            this.examDate=examDate;
            isRegistered=true;
        }
        else{
            System.out.println("This course is  registered.");
        }
    }
    //Creating remove method to remove course 
    public void remove(){
        if(isRemoved==true){
            System.out.println("This course has been removed");
        }
        else{
            super.setCourseLeader("");
            instructorName="";
            startDate="";
            completionDate="";
            examDate="";
            isRegistered=false;
            isRemoved=true;
        }
    }
    //method to display the instructor name startdate, completionDate and examDate
    public void Display(){
        super.Display();
        if(isRegistered==true){
            System.out.println("The instructor's name is "+instructorName);
            System.out.println("The starting date of the course is "+startDate);
            System.out.println("The completion date of the course is "+completionDate);
            System.out.println("The examination date of the course is "+examDate);
        }
    }
}