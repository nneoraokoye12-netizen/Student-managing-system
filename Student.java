import java.util.ArrayList;
import java.util.List;


public class Student{
  private String firstName;
  private String lastName;
  private final String studentId;
  public final ArrayList<Double> grades;
  private static final int MAX_TESTS = 5;

  public Student(String firstName, String lastName, String studentId) {
    if(studentId == null || studentId.isEmpty()) {
      System.out.print("Student ID cannot be null or empty");
    }
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentId = studentId;
    this.grades = new ArrayList<>();
  }

  public Student(String firstName, String lastName, String studentId, double[] initialGrades){
    this(firstName, lastName, studentId);
    if(initialGrades != null){ 
      for(double grade : initialGrades){
      this.grades.add(grade);
    }
    }
  }

  public String getFirstName(){
      return firstName;
    }
    //gets the first name of the student
    
    public String getLastName(){
      return lastName;
    }
    //gets the last name of the student
    public String getStudentId(){
      return studentId;
    }
    //gets the student id of the student

    public void addGrade(double grade) {
      if(grades.size() < MAX_TESTS){
        grades.add(grade);
      }
      else{
        System.out.print("Cannot add more than " + MAX_TESTS + " grades.");
      }
    }
  //adds a grade to the student's grades, and throws an exception if the student has already taken the maximum number of tests

  public void updateGrade(int index, double newGrade) {
    if(index >= 0 && index < grades.size()){
      grades.set(index, newGrade);
    }
    else{
      System.out.print("Invalid grade index: " + index);
    }
  }
  //updates a grade at a specific index, and throws an exception if the index is invalid

  public List<Double> getGrades(){
    return new ArrayList<>(grades);
  }
  
  public double getAverageGrade(){
    if(grades.isEmpty()){
      return 0.0;
    }
    double sum = 0;
    for(double grade : grades){
      sum += grade;
    }
    return sum / grades.size();
  }
  //calculates the average grade of the student
  
  public String letterGrade(){
    double average = getAverageGrade();
    if(average >= 90){
      return "A";
    }
    //if the average is greater than or equal to 90, the grade is an A
    if(average >= 80){
      return "B";
    }
    //if the average is greater than or equal to 80, the grade is a B
    if(average >= 70){
      return "C";
    }
    //if the average is greater than or equal to 70, the grade is a C
    if(average >= 60){
      return "D";
    }
      //if the average is greater than or equal to 60, the grade is a D
      return "F";
    
    //if the average is less than 60, the grade is an F
  }
  public String toString(){
    return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName + ", Average Grade: " + getAverageGrade() + ", Letter Grade: " + letterGrade();
  }
  }
//returns a string representation of the student, including their student ID, name, average grade, and letter grade
