
import java.util.Scanner;

public class Demoif1{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Please input a year: ");    
    int year = s.nextInt();
    boolean isLeapYear;

  if (year%4 ==0){
    if (year%100==0){
      if(year%400==0){
         isLeapYear = true; //2000
       }else{
          isLeapYear = false; //2100
       }
      }else{
          isLeapYear = true; //2024
       }
    }else{
          isLeapYear = false; //2023
  }

  if (isLeapYear){
    System.out.println("It is a leap year.");
  }else{
    System.out.println("It is not a leap year.");
  }
}
}
