import java.util.Scanner;

public class DemoScanner{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Please input a number: ");
    
    int number = s.nextInt();
    
    if (number%2==0){
          System.out.println("even number");
    }else{
          System.out.println("odd number");
    }
  }
}
