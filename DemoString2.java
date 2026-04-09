public class DemoString2 {
  
  public static void main(String[] args) {
    String s1 = "hello"; //"String", the Upper case "S" means the String is a "Class"
    String s2 = "hello"; // JVM create object in String Pool (unique String box)

    System.out.println(s1.equals(s2));
    System.out.println(s1==s2); //don't use "==" for String comparision 
    String s3 = new String("hello"); //new -> product object (Force)
    String s4 = new String("hello");    

    System.out.println(s3.equals(s4)); // "equals" is for checking whether they are with the same String value
    System.out.println(s3==s4); //"==" check if the are in the same address (same object)
    //for Class Object (non-promitive) always use equals for comparision
  }
}
