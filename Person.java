
import java.util.Scanner;

public class Person {

  private String name;
  private double height; //m
  private double weight; //kg

  public String bmiCat(){
    double bmi = this.getBMI();
    if (bmi>=27){
      return "Obese";
    } else if(bmi>=24 && bmi<27){
      return "Overweight";
    } else if(bmi>=18 && bmi<24){
      return "Normal";
    } else {
      return "Underweight";
    }
  }
  public boolean isOverWeight(){
      if(this.getBMI()>=24){  //return getBMI() >= 24? true: false
        return true;
      }
        return false;
  }
  //Method -> Presentation (APIE: Encapsulation)
  public String getName(){
    return this.name;
  }
  public double getHeight(){
    return this.height;
  }
  public double getWeight(){
    return this.weight;
  }
  public double getBMI(){
    return this.weight/(this.height*this.height);
  }
  //void = retrun nothing
  public void setName(String name){
    this.name = name;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
  public String bmiResult(){
    String warnMsg = "";
    if (isOverWeight()){
      warnMsg = " *** Over Weight! ***";
    }
    return "Hello, " + this.name + ". Height: " + this.height + "  Weight: " + this.weight + "  Your BMI is " + String.format("%.2f",this.getBMI()) +" (" + this.bmiCat() + ")." + warnMsg;   
  }

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
