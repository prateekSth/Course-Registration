import javax.swing.*; //importing the javax.swing packages 
import java.awt.*; //importing java.awt packages
import java.awt.event.*; //importing java.awt.event for event handling
import java.util.*; //importing java.util class
public  class IngCollage implements ActionListener{
    JFrame frame1, frame2, frame3; //Declaring frame for the form
    JButton btnAcademic, btnNonAcademic; //declaring button for main form
    
    //Declaring  for creating the form
    private JLabel ltitle1,ltitle2, ltitle3, lCourseID1, lCourseName1,lCourseID2, lCourseName2, lDuration1, lCourseLeader1,lCourseLeader2, lLecturerName1, lLevel1, lCredit1, lStartDate1,lCompletionDate1, lNumberOfAssessment1 ,lInstructorName2,lExamDate2, lPrerequisites2, lStartDate2,lCompletionDate2, lDuration2;
    
    //Declaring textfield for creating the form
    private JTextField tfCourseID1, tfCourseName1, tfDuration1, tfCourseLeader1, tfLecturerName1, tfLevel1, tfCredit1, tfStartDate1,tfCompletionDate1, tfNumberOfAssessment1,
                tfCourseID2,tfCourseName2, tfDuration2,tfCourseLeader2,tfInstructorName2, tfExamDate2,tfStartDate2,tfCompletionDate2, tfPrerequisites2;
               

    
    //Declaring button for Non Academic Course
    private JButton btn1Add,btn2Add, btn1Clear,btn2Clear, btn1Register, btn1Display,btn2Register, btn2Display,btn1AcademicCourse, btn2NonAcademicCourse,btn2Remove;
    
    //Declaring panel for form
    JPanel panel1, panel2, panel3, panel4, panel5;
    
    //Creating arrayList for storing value
    ArrayList<Course> course = new ArrayList <Course>();
    private String CourseID, CourseName, Duration, CourseLeader, LecturerName, Level, Credit, StartDate,CompletionDate, NumberOfAssessment;
    private String CourseID2,CourseName2,Duration2,CourseLeader2,InstructorName2, ExamDate2,StartDate2,CompletionDate2, Prerequisites2;
    //Creating constructor of main class
    public IngCollage(){
        //creating object for color
        Color btnclr = new Color(233, 243, 243);
        Color smallbox = new Color(240, 165, 18);
        Color bigbox = new Color(194, 201, 200);
        
        //creating Frame and panel for main class
        frame1 = new JFrame("IngCollage");
        panel1 = new JPanel();
        
        //Title for main class
        ltitle1= new JLabel("Welcome to Islington College"); //defining ltitle as JLabel type
        ltitle1.setBounds(120,50,500,100);
        ltitle1.setFont(new Font("SanSerif Bold Italic", Font.BOLD, 25));
        
        //JButton for main class
        //academic course button on main frame
        btn1AcademicCourse = new JButton(" Academic Course ");
        btn1AcademicCourse.setFont(new Font("Arial", Font.BOLD, 14));
        btn1AcademicCourse.setBounds(80,180,200,50);
        btn1AcademicCourse.addActionListener(this);
        btn1AcademicCourse.setBackground(btnclr);
        
        //Non academic course button on main frame
        btn2NonAcademicCourse = new JButton(" Non-Academic Course ");
        btn2NonAcademicCourse.setFont(new Font("Arial", Font.BOLD, 14));
        btn2NonAcademicCourse.setBounds(320,180,200,50);
        btn2NonAcademicCourse.addActionListener(this);
        btn2NonAcademicCourse.setBackground(btnclr);
        
        //adding component of main class to panel
        panel1.add(ltitle1);
        panel1.add(btn1AcademicCourse);
        panel1.add(btn2NonAcademicCourse);
        panel1.setLayout(null);
        panel1.setBackground(smallbox);
        
        //adding panel to frame 
        frame1.add(panel1);
        frame1.setSize(600,400);
        frame1.setVisible(true);
    
        //Creating JFrame and panel for academic class
        frame2 = new JFrame("Academic Course");
        panel2 = new JPanel();
        panel4 = new JPanel();
        
        //Creating JLabel for academic class.....
        ltitle2 = new JLabel("Academic Course");
        ltitle2.setBounds(130,50,350,70);
        ltitle2.setFont(new Font("san-serif",Font.BOLD,35));
        
        //Course ID for academicCourse
        lCourseID1 = new JLabel("Course ID* ");
        tfCourseID1 = new JTextField();
        lCourseID1.setBounds(50,150,200,25);
        tfCourseID1.setBounds(50,180,200,40);
        lCourseID1.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Course Name for academicCourse
        lCourseName1 = new JLabel("Course Name* ");
        tfCourseName1  = new JTextField();
        lCourseName1.setBounds(300,150,200,25);
        tfCourseName1.setBounds(300,180,200,40);
        lCourseName1.setFont(new Font("san-serif",Font.BOLD,15));
        
        //CourseLeader for academicCourse
        lCourseLeader1 = new JLabel("Course Leader* ");
        tfCourseLeader1 = new JTextField();
        lCourseLeader1.setBounds(50,250,200,25);
        tfCourseLeader1.setBounds(50,280,200,40);
        lCourseLeader1.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Lecturer Name for academicCourse
        lLecturerName1 = new JLabel("Lecturer Name* ");
        tfLecturerName1 = new JTextField();
        lLecturerName1.setBounds(300,250,200,25);
        tfLecturerName1.setBounds(300,280,200,40);
        lLecturerName1.setFont(new Font("san-serif",Font.BOLD,15));
        
        // Start Date for academicCourse
        lStartDate1= new JLabel("StartDate* ");
        tfStartDate1 = new JTextField();
        lStartDate1.setBounds(50,350,200,25);
        tfStartDate1.setBounds(50,380,200,40);
        lStartDate1.setFont(new Font("san-serif",Font.BOLD,15));
    
        //Completion date for academicCourse
        lCompletionDate1 = new JLabel("Completion Date*");
        tfCompletionDate1 = new JTextField();
        lCompletionDate1.setBounds(300,350,200,25);
        tfCompletionDate1.setBounds(300,380,200,40);
        lCompletionDate1.setFont(new Font("san-serif",Font.BOLD,15));
        
        // Level for academicCourse
        lLevel1= new JLabel("Level* ");
        tfLevel1 = new JTextField();
        lLevel1.setBounds(50,450,200,25);
        tfLevel1.setBounds(50,480,200,40);
        lLevel1.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Credit for academicCourse
        lCredit1 = new JLabel("Credit* ");
        tfCredit1 = new JTextField();
        lCredit1.setBounds(300,450,200,25); 
        tfCredit1.setBounds(300,480,200,40);
        lCredit1.setFont(new Font("san-serif",Font.BOLD,15));
        
        // Number of assessment for academicCourse
        lNumberOfAssessment1 = new JLabel("Number of Assessment* ");
        tfNumberOfAssessment1 = new JTextField();
        lNumberOfAssessment1.setBounds(50,550,200,25);
        tfNumberOfAssessment1.setBounds(50,580,200,40);
        lNumberOfAssessment1.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Duration for academicCourse
        lDuration1 = new JLabel("Duration* ");
        tfDuration1 = new JTextField();
        lDuration1.setBounds(300,550,200,25);    
        tfDuration1.setBounds(300,580,200,40);
        lDuration1.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Button for Academic Course
        //Add Button
        btn1Add=new JButton("Add");
        btn1Add.setBounds(50,220,120,40);
        btn1Add.setFont(new Font("san-serif",Font.BOLD,15));
        btn1Add.addActionListener(this);
        btn1Add.setBackground(btnclr);
        
        //Register Button
        btn1Register=new JButton("Register");
        btn1Register.setBounds(50,320,120,40);
        btn1Register.setFont(new Font("san-serif",Font.BOLD,15));
        btn1Register.addActionListener(this);
        btn1Register.setBackground(btnclr);
        
        //Display Button 
        btn1Display=new JButton("Display");
        btn1Display.setBounds(50,420,120,40);
        btn1Display.setFont(new Font("san-serif",Font.BOLD,15));
        btn1Display.addActionListener(this);
        btn1Display.setBackground(btnclr);
        
        //Clear Button
        btn1Clear=new JButton("Clear");
        btn1Clear.setBounds(50,520,120,40);
        btn1Clear.setFont(new Font("san-serif",Font.BOLD,15));
        btn1Clear.addActionListener(this);
        btn1Clear.setBackground(btnclr);
    
        
        //panel set design
        panel2.setSize(530,700);
        panel2.setLocation(0,0);
        panel2.setLayout(null);
        panel4.setSize(300,700);
        panel4.setLocation(525,0);
        panel4.setLayout(null);
        panel4.setBackground(smallbox);
        panel2.setBackground(bigbox);
        
        //adding component on panel2 for Academic class
        panel2.add(ltitle2);
        panel2.add(lCourseID1);
        panel2.add(lCourseName1);
        panel2.add(lDuration1);
        panel2.add(lCourseLeader1);
        panel2.add(lLecturerName1);
        panel2.add(lLevel1);
        panel2.add(lCredit1);
        panel2.add(lCompletionDate1);
        panel2.add(lNumberOfAssessment1);
        panel2.add(lStartDate1);
        //adding JTextfield on panel
        panel2.add(tfCourseID1);
        panel2.add(tfCourseName1);
        panel2.add(tfDuration1);
        panel2.add(tfCourseLeader1);
        panel2.add(tfLecturerName1);
        panel2.add(tfLevel1);
        panel2.add(tfCredit1);
        panel2.add(tfStartDate1);
        panel2.add(tfCompletionDate1);
        panel2.add(tfNumberOfAssessment1);
        
        //Adding component on panel4 (academic Course)
        panel4.add(btn1Add);
        panel4.add(btn1Register);
        panel4.add(btn1Display);
        panel4.add(btn1Clear);
        
        //adding panel on frame
        frame2.add(panel2);
        frame2.add(panel4);
        frame2.setLayout(null);
        frame2.setSize(750,700); //setting the size of frame
        
        //Creating JFrame and panel for Non academic class
        frame3 = new JFrame("Non Academic Course");
        //creating panels for non academic class
        panel3 = new JPanel();
        panel5 = new JPanel();
        //Components for Non Academic Course
        
        //Tittle for Non Academic Course
        ltitle3 = new JLabel("Non-Academic Course");
        ltitle3.setBounds(110,50,500,70);
        ltitle3.setFont(new Font("san-serif",Font.BOLD,35));
        
        //Course ID for Non Academic Course
        lCourseID2 = new JLabel("Course ID* ");  
        tfCourseID2 = new JTextField();
        lCourseID2.setBounds(50,150,200,25);
        tfCourseID2.setBounds(50,180,200,40);
        lCourseID2.setFont(new Font("san-serif",Font.BOLD,15));
        
        //course Name for Non Academic Course
        lCourseName2 = new JLabel("Course Name* ");
        tfCourseName2  = new JTextField();
        lCourseName2.setBounds(300,150,200,25);
        tfCourseName2.setBounds(300,180,200,40);
        lCourseName2.setFont(new Font("san-serif",Font.BOLD,15));
        
        // Course Leader for Non Academic Course
        lCourseLeader2 = new JLabel("Course Leader* ");
        tfCourseLeader2 = new JTextField();
        lCourseLeader2.setBounds(50,250,200,25);
        tfCourseLeader2.setBounds(50,280,200,40);
        lCourseLeader2.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Instructor for Non Academic Course
        lInstructorName2 = new JLabel("Instructor Name* ");
        tfInstructorName2 = new JTextField();
        lInstructorName2.setBounds(300,250,200,25);
        tfInstructorName2.setBounds(300,280,200,40);
        lInstructorName2.setFont(new Font("san-serif",Font.BOLD,15));

        //StartDate for Non Academic Course
        lStartDate2 = new JLabel("Start Date* ");
        tfStartDate2 = new JTextField();
        lStartDate2.setBounds(50,350,200,25);
        tfStartDate2.setBounds(50,380,200,40);
        lStartDate2.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Completion Date for Non Academic Course
        lCompletionDate2 = new JLabel("Completion Date*");
        tfCompletionDate2 = new JTextField();
        lCompletionDate2.setBounds(300,350,200,25);
        tfCompletionDate2.setBounds(300,380,200,40);
        lCompletionDate2.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Prerequisites for Non Academic Course
        lPrerequisites2 = new JLabel("Prerequisites* ");
        tfPrerequisites2 = new JTextField();
        lPrerequisites2.setBounds(50,450,200,25);
        tfPrerequisites2.setBounds(50,480,200,40);
        lPrerequisites2.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Exam Date for Non Academic Course
        lExamDate2 = new JLabel("Exam Date* ");
        tfExamDate2 = new JTextField();
        lExamDate2.setBounds(300,450,200,25); 
        tfExamDate2.setBounds(300,480,200,40);
        lExamDate2.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Duration for Non Academic Course
        lDuration2 = new JLabel("Duration* ");
        tfDuration2 = new JTextField();
        lDuration2.setBounds(50,550,200,25);    
        tfDuration2.setBounds(50,580,200,40);
        lDuration2.setFont(new Font("san-serif",Font.BOLD,15));
        
        //Button for Non Academic Course
        //Add Button 
        btn2Add=new JButton("Add");
        btn2Add.setBounds(50,150,120,40);
        btn2Add.setFont(new Font("san-serif",Font.BOLD,15));
        btn2Add.addActionListener(this);
        btn2Add.setBackground(btnclr);
        
        //Register Button
        btn2Register=new JButton("Register");
        btn2Register.setBounds(50,250,120,40);
        btn2Register.setFont(new Font("san-serif",Font.BOLD,15));
        btn2Register.addActionListener(this);
        btn2Register.setBackground(btnclr);
        
        //Display Button
        btn2Display=new JButton("Display");
        btn2Display.setBounds(50,350,120,40);
        btn2Display.setFont(new Font("san-serif",Font.BOLD,15));
        btn2Display.addActionListener(this);
        btn2Display.setBackground(btnclr);
        
        //Remove Button
        btn2Remove = new JButton("Remove");
        btn2Remove.setBounds(50,450,120,40);
        btn2Remove.setFont(new Font("san-serif",Font.BOLD,15));
        btn2Remove.addActionListener(this);
        btn2Remove.setBackground(btnclr);
        //Clear Button
        btn2Clear = new JButton("Clear");
        btn2Clear.setBounds(50,550,120,40);
        btn2Clear.setFont(new Font("san-serif",Font.BOLD,15));
        btn2Clear.addActionListener(this);
        btn2Clear.setBackground(btnclr);
        
        //panel3 set design
        
        panel3.setBackground(bigbox);
        panel5.setBackground(smallbox);
        panel3.setSize(530,700);
        panel3.setLocation(0,0);
        panel3.setLayout(null);
        
        //Panel5 set Design
        panel5.setSize(300,700);
        panel5.setLocation(530,0);
        panel5.setLayout(null);
        
        //Adding component on panel3
        panel3.add(ltitle3);
        panel3.add(lCourseID2);
        panel3.add(lCourseName2);
        panel3.add(lCourseLeader2);
        panel3.add(lInstructorName2);
        panel3.add(lStartDate2);
        panel3.add(lCompletionDate2);
        panel3.add(lPrerequisites2);
        panel3.add(lExamDate2);
        panel3.add(lDuration2);        
        panel3.add(tfCourseID2);
        panel3.add(tfCourseName2);
        panel3.add(tfCourseLeader2);
        panel3.add(tfInstructorName2);
        panel3.add(tfStartDate2);
        panel3.add(tfCompletionDate2);
        panel3.add(tfPrerequisites2);
        panel3.add(tfExamDate2);
        panel3.add(tfDuration2);
        //Adding components on panel5
        panel5.add(btn2Add);
        panel5.add(btn2Register);
        panel5.add(btn2Display);
        panel5.add(btn2Remove);
        panel5.add(btn2Clear);
        //adding panel to frame 
        frame3.add(panel3);
        frame3.add(panel5);
        frame3.setLayout(null);
        frame3.setSize(750,700); //setting the size of frame
        
   
    }
    public void actionPerformed(ActionEvent e){//Using Action Listener 
        if ( e.getSource() == btn1Clear ) {//btn to clear textfield for academic course
            tfCourseID1.setText("");
            tfCourseName1.setText("");
            tfCourseLeader1.setText("");
            tfLecturerName1.setText("");
            tfStartDate1.setText("");
            tfCompletionDate1.setText("");
            tfLevel1.setText("");
            tfCredit1.setText("");
            tfDuration1.setText("");
            tfNumberOfAssessment1.setText("");
        }
        else if ( e.getSource() == btn2Clear ) {//btn to clear textfield for non academic course
            tfCourseID2.setText("");
            tfCourseName2.setText("");
            tfCourseLeader2.setText("");
            tfInstructorName2.setText("");
            tfStartDate2.setText("");
            tfCompletionDate2.setText("");
            tfPrerequisites2.setText("");
            tfExamDate2.setText("");
            tfDuration2.setText("");
        }
        else if(e.getSource().equals(btn1AcademicCourse)){//to open Academic Course  form
            frame2.setVisible(true);
            frame3.setVisible(false);
        }
        else if(e.getSource().equals(btn2NonAcademicCourse)){// to open Non Academic Course form
            frame2.setVisible(false);
            frame3.setVisible(true);
        }
        
        else if(e.getSource().equals(btn1Add)){ //to add Value of Acadmeic Course
             addAcademicCourse();
        }
        else if(e.getSource().equals(btn2Add)){ //to add Value of Non Acadmeic Course
            addNonAcademicCourse();
        }
        else if(e.getSource() == btn1Register){//to Register value of Acadmeic Course
            register1();
        }
        else if(e.getSource() == btn2Register){//to Register value of Non-Acadmeic Course
            register2();
        }
        else if(e.getSource()== btn2Remove){//to Remove value of Non-Acadmeic Course
            remove();    
        }
        else if(e.getSource() == btn1Display){//to remove value ofAcadm eic Course
            for(Course ac_co: course){
                AcademicCourse ac_d = (AcademicCourse) ac_co;
                ac_d.Display();
            }   
        }       
        else if(e.getSource() == btn2Display){//to Remove value of Non-Acadmeic Course
            for(Course nac_co: course){
                NonacademicCourse nac_d = (NonacademicCourse) nac_co;
                nac_d.Display();
            }   
        }
    }
    public void register1(){//register method for academic course
        try{
            //storing user input value
            CourseID=tfCourseID1.getText();
            CourseName=tfCourseName1.getText();
            CourseLeader=tfCourseLeader1.getText();
            LecturerName = tfLecturerName1.getText();
            Duration=tfDuration1.getText();
            Level=tfLevel1.getText();
            Credit=tfCredit1.getText();
            NumberOfAssessment=tfNumberOfAssessment1.getText();
            StartDate = tfStartDate1.getText();
            CompletionDate = tfCompletionDate1.getText();
            int duration1 = Integer.parseInt(Duration);
            int numberOfAssessment1 = Integer.parseInt(NumberOfAssessment);
            boolean courseIsFound1 = false;
            for(Course ac_co: course){
                if(ac_co.getCourseID().equals(CourseID)){
                        AcademicCourse ac_c = (AcademicCourse) ac_co;
                        if(ac_c.getIsRegistered()){
                            JOptionPane.showMessageDialog(frame2,"The Academic Course is already Registered. "); //JOptionPanel  for non academic course if it is already registered
                            courseIsFound1 = true;    
                        }
                        else{
                            ac_c.Registered(CourseLeader, LecturerName, StartDate, CompletionDate);
                            JOptionPane.showMessageDialog(frame2,"The Academic Course is Registered successfully. "); //JOptionPanel  for non academic course if it is already registered
                            courseIsFound1 = true;
                            break;
                        }
                }            
                }
            if(courseIsFound1 == false){
                JOptionPane.showMessageDialog(frame2,"The Academic Course is not Found. ");     //JOptionPanel  for non academic course if not found
            }
        }
        catch(Exception ex1){
            JOptionPane.showMessageDialog(frame2,"Please input valid value. ");   //JOptionPanel  for academic course if input is invalid      
        }        
    }
    public void register2(){//register method for non academic course
        try{
            //creating obj for storing user input value
            CourseID2=tfCourseID2.getText();
            CourseName2=tfCourseName2.getText();
            CourseLeader2=tfCourseLeader2.getText();
            String InstructorName2 = tfInstructorName2.getText();
            Duration2=tfDuration2.getText();
            StartDate2 = tfStartDate2.getText();
            CompletionDate2 = tfCompletionDate2.getText();
            ExamDate2 = tfExamDate2.getText();
            Prerequisites2 = tfPrerequisites2.getText();
            int duration2 = Integer.parseInt(Duration2);
            boolean courseIsFound2 = false;
            for(Course nac_co: course){
                if(nac_co.getCourseID().equals(CourseID2)){
                    NonacademicCourse nac_c = (NonacademicCourse) nac_co;
                    if(nac_c.getIsRegistered()){
                        JOptionPane.showMessageDialog(frame3,"The Non Academic Course is already Registered. "); //JOptionPanel  for non academic course if input is already registered
                        courseIsFound2 = true;    
                    }
                    else{
                        nac_c.register(CourseLeader2, InstructorName2,ExamDate2, StartDate2, CompletionDate2);
                        JOptionPane.showMessageDialog(frame3,"The Non Academic Course is Registered successfully. "); //JOptionPanel  for non academic course if input is registered successfully
                        courseIsFound2 = true;
                        break;
                    }
                }
            }
            if(courseIsFound2 == false){
                JOptionPane.showMessageDialog(frame3,"The Non Academic Course is not Found. ");//JOptionPanel  for non academic course if course is not found
            }
        }
        catch(Exception ex2){
            JOptionPane.showMessageDialog(frame3,"Please input valid value. ");  //JOptionPanel  for non academic course if input is invalid      
        }    
        }
    public void addAcademicCourse(){//add method for academic course
        try{
            //creating obj to store user input value
            CourseID=tfCourseID1.getText();
            CourseName=tfCourseName1.getText();
            CourseLeader=tfCourseLeader1.getText();
            LecturerName = tfLecturerName1.getText();
            Duration=tfDuration1.getText();
            Level=tfLevel1.getText();
            Credit=tfCredit1.getText();
            NumberOfAssessment=tfNumberOfAssessment1.getText();
            StartDate = tfStartDate1.getText();
            CompletionDate = tfCompletionDate1.getText();
            int duration1 = Integer.parseInt(Duration);
            int numberOfAssessment1 = Integer.parseInt(NumberOfAssessment);
            boolean courseIsAdded1 = false;
            for(Course ac_co: course){
                if(ac_co.getCourseID().equals(CourseID)){
                    courseIsAdded1 = true;
                    break;
                }
            }
            if(courseIsAdded1 == false){
                AcademicCourse ac_co = new AcademicCourse(CourseID, CourseName, duration1, Level, Credit,numberOfAssessment1);//downcasting
                course.add(ac_co);
                JOptionPane.showMessageDialog(frame2,"The course is added to Academic Course");//JOptionPanel  for academic course if academic course is added
            }
            else if(courseIsAdded1 == true){
                JOptionPane.showMessageDialog(frame2,"The Academic Course is already added. ");//JOptionPanel  for academic course if input is already added
            }
        }
        catch(Exception exp1){
            JOptionPane.showMessageDialog(frame2,"Please enter valid value");//JOptionPanel  for academic course if input is invalid
        }
    }
    public void addNonAcademicCourse(){//add method for non academic course
        try{
            //creating obj of user input value
            CourseID2=tfCourseID2.getText();
            CourseName2=tfCourseName2.getText();
            CourseLeader2=tfCourseLeader2.getText();
            InstructorName2 = tfInstructorName2.getText();
            Duration2=tfDuration2.getText();
            StartDate2 = tfStartDate2.getText();
            CompletionDate2 = tfCompletionDate2.getText();
            ExamDate2 = tfExamDate2.getText();
            Prerequisites2 = tfPrerequisites2.getText();
            //converting String to Integer
            int duration2 = Integer.parseInt(Duration2);
            boolean courseIsAdded2 = false;
            for(Course nac_co: course){//creating obj of non academic course from Course class
                if(nac_co.getCourseID().equals(CourseID2)){
                    courseIsAdded2 = true;
                    break;
                }
            }
            if(courseIsAdded2 == false){//if course is not added
                NonacademicCourse nac_co = new NonacademicCourse(CourseID2, CourseName2, duration2, Prerequisites2);
                course.add(nac_co);//adding non academic class
                JOptionPane.showMessageDialog(frame3,"The course is added to Non Academic Course");//JOptionPanel  for adding non academic course
            }
            else if(courseIsAdded2 == true){
                JOptionPane.showMessageDialog(frame3,"The Non-Academic Course is already added. ");//JOptionPanel  if  non academic course already added
            }
        }
        catch(Exception exp2){
            JOptionPane.showMessageDialog(frame3,"Please enter valid value");//JOptionPanel  for non academic course if value is invalid
        }
    }
    public void remove(){//remove method for academic course
        try{
            CourseID2 = tfCourseID2.getText();
            if(CourseID2.equals("")){
                JOptionPane.showMessageDialog(frame3,"Invalid Value.");//JOptionPanel  for non academic course if input is invalid   
            }
            else{
                boolean courseIsFound2 = false;
                for(Course nac_co: course){
                    if(nac_co.getCourseID().equals(CourseID2)){
                        NonacademicCourse nac_r = (NonacademicCourse) nac_co;//downcasting
                        nac_r.getIsRemoved();
                        if(nac_r.getIsRemoved() == true){
                        JOptionPane.showMessageDialog(frame3,"Course is already Removed."); //JOptionPanel for frame3 remove
                        courseIsFound2 = true;
                        }
                        else{
                            nac_r.remove();
                            JOptionPane.showMessageDialog(frame3,"Course is successfully Removed.");//JOptionPanel if non academic course is removed successfully  
                            courseIsFound2 = true;
                        }
                    }
                }
                if(courseIsFound2 == false){
                    JOptionPane.showMessageDialog(frame3,"Non Academic Course is not found."); //JOptionPanel for frame3 non academic course not found    
                }
            }
        }
        catch(Exception expr){//Exception catch for frame3
            JOptionPane.showMessageDialog(frame3,"Please enter Valid value."); //JOptionPanel for frame3
        }
    }
    //static main method 
    public static void main(String[] args){
        new IngCollage();//invoking constructor  
    }
}    
  
    
