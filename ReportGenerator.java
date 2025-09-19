import java.util.List;

 public class ReportGenerator{
   public static void generateReport(List<Student> students){
   System.out.println("\n============~~~CLASS REPORTS~~~============");
   for(Student s : students){
     System.out.println(s);
   }
//prints a report of all students in the class, including their student ID, name, average grade, and letter grade
   }

public static void printStudentGrades(Student s){
  System.out.println("\n============~~~STUDENT GRADES~~~============");
  System.out.println("Student: " + s.getFirstName() + " " + s.getLastName());
  System.out.println("ID: " + s.getStudentId());
  System.out.println("Grades: " + s.getGrades());
  System.out.println("Average: " + s.getAverageGrade());
  System.out.println("Letter Grade: " + s.letterGrade());
  System.out.println("===========================================");
}
//prints a report of a single student's grades, including their student ID, name, grades, average grade, and letter grade

public static void printStatistics(GradeManager gm){
  System.out.println("\n============~~~CLASS STATISTICS~~~============");
  System.out.println("Total Students: " + gm.getAllStudents().size());
  System.out.println("Average Class Grade: " + gm.getAverageClassGrade());
  System.out.println("===========================================");
}
//prints a report of the class statistics, including the total number of students and the average class grade
 }