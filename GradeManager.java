import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeManager{
  private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String firstName, String lastName){
        String studentId = generateStudentId();
        students.add(new Student(firstName, lastName, studentId)); 
        System.out.println("New SRudent Id: " + studentId);
        } 
    
    //initiates a new student object and adds it to the list of students

    public void removeStudent(String studentId){
        Student student = findStudentById(studentId);
        if(student != null){
            students.remove(student);
            System.out.println("Student removed successfully!");
        }
        else{
            System.out.println("Student not found.");
        }
    }
    //if the student is found, it is removed from the list of students, otherwise an error message is displayed

    public Student findStudentById(String studentId){
        for(Student student : students){
            if(student.getStudentId().equals(studentId)){
                return student;
            }
        }
        return null;
    }
    //searches for a student by their student ID and returns the student object if found, otherwise returns null
    
    public List<Student> getAllStudents(){
        return new ArrayList<>(students);
    }
    //returns a list of all students
    public static String generateStudentId(){
        return "S" + (int)(Math.random() * 9000000);
    }
    //generates a random student ID

    public double getAverageClassGrade(){
        if(students.isEmpty()){
            return 0.0;
        }
        double totalAverage = 0.0;
        int studentsWithGrades = 0;
        for(Student student : students){
            if(!student.getGrades().isEmpty()){
                totalAverage += student.getAverageGrade();
                studentsWithGrades++;
            }
        }
        return studentsWithGrades > 0 ? totalAverage / studentsWithGrades : 0.0;
    }
    //calculates and returns the average grade of all students in the class
}
