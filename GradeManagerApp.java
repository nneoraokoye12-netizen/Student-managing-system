    import java.util.Scanner;

public class GradeManagerApp{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    GradeManager gradeManager = new GradeManager();
    MenuSystem menuSystem = new MenuSystem(scanner, gradeManager);

      System.out.println("Welcome to the Grade Manager System!");
      System.out.println("==================================");

    boolean running = true;
    while(running){
      menuSystem.displayMenu();
      int choice = menuSystem.getUserChoice();
      running = menuSystem.processChoice(choice);
    }
  System.out.println("Thank you for using the Student Grade Manager System!");
  }
}