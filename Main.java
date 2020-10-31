import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("GPA Calculator");
    System.out.println("Enter number of courses: ");
    int numCo = reader.nextInt();
    double totalPoints = 0;
    double totalCredits = 0;
    for(int i = 0; i < numCo; i++){
      System.out.println("Enter course name: ");
      String course = reader.nextLine();
      System.out.println("Enter credits: ");
      double credits = reader.nextDouble();
      totalCredits += credits;
      System.out.println("Grade value: ");
      double gradeValue = reader.nextDouble();
      double pointsEarned = gradeValue * credits;
      totalPoints += pointsEarned;

    }
    double gpa = totalPoints/totalCredits;
    System.out.println("GPA: " + gpa);

  }
}