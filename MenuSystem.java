import java.util.Scanner;
import java.util.List;

public class MenuSystem {
  private final Scanner scanner;
  private final GradeManager gradeManager;

  public MenuSystem(Scanner scanner, GradeManager gradeManager) {
    this.scanner = scanner;
    this.gradeManager = gradeManager;
  }

  public void displayMenu() {
    System.out.println("\n~~~~ Menu: ~~~~");
    System.out.println("1. Add Student");
    System.out.println("2. Remove Student");
    System.out.println("3. View All Students");
    System.out.println("4. Add Grade");
    System.out.println("5. Update Grade");
    System.out.println("6. Class Statistics");
    System.out.println("7. Exit");
    System.out.print("Enter your choice: ");
  }
  // displays the menu options to the user

  public int getUserChoice() {
   int choice = -1;
    choice = Integer.parseInt(scanner.nextLine());
     if(choice < 1 && choice > 6) {
      System.out.println("Invalid input. Please enter a number between 1 and 6.");
     }
    return choice;
    // prompts the user to enter their choice and returns it as an integer
  }

  public boolean processChoice(int choice) {
    switch (choice) {
      case 1:
        addStudent();
        break;
      case 2:
        removeStudent();
        break;
      case 3:
        viewAllStudents();
        break;
      case 4:
        addGrade();
        break;
      case 5:
        updateGrade();
        break;
      case 6:
        ReportGenerator.printStatistics(gradeManager);
        break;
      case 7:
        return false;
      default:
        System.out.println("Invalid choice. Please try again.");
    }
    return true; // Continue running the program
  }
  // processes the user's choice and performs the corresponding action if the
  // choice is valid, otherwise displays an error message

  private void addStudent() {
    System.out.print("Enter first name: ");
    String firstName = scanner.nextLine();
    System.out.print("Enter last name: ");
    String lastName = scanner.nextLine();
    gradeManager.addStudent(firstName, lastName);
  }
  // prompts the user to enter the first and last name of the student, generates a
  // student ID, creates a new student object, and adds it to the grade manager

  private void viewAllStudents() {
    List<Student> students = gradeManager.getAllStudents();
    if (students.isEmpty()) {
      System.out.println("No students found.");
    } else {
      System.out.println("All Students:");
      for (Student student : students) {
        System.out.println(student);
      }
    }
  }

  private void addGrade() {
    System.out.print("Enter student ID: ");
    String studentId = scanner.nextLine();
    Student s = gradeManager.findStudentById(studentId);
    if (s != null) {
      System.out.print("Enter grade: ");
        double grade = Double.parseDouble(scanner.nextLine());
        s.addGrade(grade);
        System.out.println("Grade added successfully!");
    } else {
      System.out.println("Student not found.");
    }
  }

  private void updateGrade() {
    System.out.print("Enter student ID: ");
    String studentId = scanner.nextLine();
    Student s = gradeManager.findStudentById(studentId);
    if (s != null) {
      System.out.println("Current grades: " + s.getGrades());
      System.out.print("Enter grade index to update " + (s.getGrades().size() - 1) + "): ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new grade: ");
        double newGrade = Double.parseDouble(scanner.nextLine());
        s.updateGrade(index, newGrade);
        System.out.println("Grade updated successfully!");
    } else {
      System.out.println("Student not found.");
    }
  }

  // prompts the user to enter the student ID of the student whose grades they
  // want to enter or update, and then allows the user to add or update grades for
  // that student
  private void searchStudent() {
    System.out.print("Enter student name: ");
    String name = scanner.nextLine();
    // Search functionality not implemented in GradeManager, skipping for now
    System.out.println("Search functionality not yet implemented.");
  }

  // prompts the user to enter the name of the student they want to search for,
  // and then displays all students with that name
  private void removeStudent() {
    System.out.print("Enter student ID: ");
    String studentId = scanner.nextLine();
    Student s = gradeManager.findStudentById(studentId);
    if (s != null) {
      gradeManager.removeStudent(studentId);
      System.out.println("Student removed: " + s);
    } else {
      System.out.println("Student not found.");
    }
  }
  // prompts the user to enter the student ID of the student they want to remove,
  // and then removes that student from the grade manager if they exist
}
