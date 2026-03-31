public class DemoStrng{
  public static void main(String[] args) {
      System.out.println("hello");
      String s1 = "hello";
      char c1 = 'c';
      System.out.println(s1);
  
      //String is not Primitive, but a class, has methods (funtion)
      //1. length()
      System.out.println(s1.length());
      //2, charAt()
      System.out.println(s1.charAt(s1.length()-1));
      //3. equals()
      String s3 = "hello";
      System.out.println(s1.equals(s3)); 
      //return boolean true
      String s4 = "hi";
      System.out.println(s3.equals(s4));
  }
}
