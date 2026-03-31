public class DemoIf2{
  public static void main(String[] args){
  int age = 13;
    if (age>=18){
        System.out.println("greater or equal than 18");
    } else{
        System.out.println("child");
    }
  boolean isElderly = age>65;
    if (isElderly){
        System.out.println("Fee is $2");
    } else {
        System.out.println("No discount.");
    }
  // && will group together
  //Event 1: a>20 
  //Event 2:; b>6 && b<20
  int a = 28;
  int b = 21;
  if (a>20 || b> 6 && b<20){
    System.out.println("Hi");
  }
}
}