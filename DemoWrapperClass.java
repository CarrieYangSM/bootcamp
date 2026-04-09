public class DemoWrapperClass {
  
  public static void main(String[] args) {
    
    //Primitive: byte, short, int, long, float, double, char, boolean
    // Wrapper Class

/* 
    byte b1 = 100; //Primitive
    Byte b2 = 100; //Class

    short s1 = 100;
    Short s2 = 100;

    int x1 = 100;
    if (x1==100){

    }
    Integer x2 = 100;
    if (x2.compareTo(100)>0){ //check if x2 is larger than 100
      System.out.println("Larger than");
    }
    if (x2.compareTo(100)<0){  //check if x2 is small than 100
      System.out.println("Smaller than");
    }
    if (x2.equals(100)){ // check if x2 equals to 100
      System.err.println("equal");
    }

    long l1 = 100L;
    Long l2 = 100L;

    float f1 = 9.0f;
    Float f2 = 9.0f;

    double d1 = 100.99;
    Double d2 = 100.99;

    char ch1 = 'c';
    Character ch2 = 'c';

    if(ch2.equals('c')){
      System.out.println("equals");
    }

    boolean o1 = true;
    Boolean o2 = true;
*/

    Integer k1 = 127;
    Integer k2 = 127;
    System.out.println(k1.equals(k2)); // true
    System.out.println(k1==k2); // true, same address

    Integer k3 = 128;
    Integer k4 = 128;
    System.out.println(k3.equals(k4)); // true
    System.out.println(k3==k4); // false, different address

    //Implicit Promotion
    float f10 = 1000L;
    double d10 = 10.9f;
    float f12 = 19;
    byte b10 = 127;
    double d11 = b10;
    int x10 = 'a';
    double d12 = 'a';

    //Wrapper Class vs Primitives (auto-box / un-box)
    //auto-box (long -> long)
    Long l30 = 100L; //long to Long
    Integer i30 = 100; //int to Integer
    Character ch30 = 'x'; //char to Character

    //un-box (Long to long)
    long l31 = l30;
    int i31 = i30;
    char ch31 = ch30; 

    //long l20 = 100; //int -> long
    // Java would NOT auto-box & un-box
    // Long l21 = 100; //int -> long (implicit promotion) -> Long (auto-box)
    // Double d100 = 10; // int -> double -> Double
  }
}
