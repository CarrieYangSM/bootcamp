
import java.util.Scanner;

public class BMI{
  public static void main(String[] args) {
    
    Person p1 = new Person();
    Scanner scanner = new Scanner(System.in);
    System.out.println("    ************** BMI Calaculation **************");
    System.out.println("Hello, what is your name?");
    p1.setName(scanner.next());
    System.out.println("Please input your weight(in kg).");
    p1.setWeight(scanner.nextDouble());
    System.out.println("Please input your height(in m).");
    p1.setHeight(scanner.nextDouble());

    System.out.println(p1.bmiResult()); 
  }
}
