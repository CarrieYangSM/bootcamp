public class Primitives{
  public static void main(String[] args) {
      int appleCount = 13;
      double applePrice = 11.01;
    System.out.println(appleCount);
    System.out.println(applePrice);

    // Primitive (Raw Data Type)
    // int, byte, short, long
    // double, float
    // boolean
    // char

    // true or false
    boolean isElderly = true;
    System.out.println(isElderly);

    char c1 ='H';
    char c2 = '哈';
    System.out.println(c1 + c2);

    int i1;
    i1 = 100;
    int i2 = 200;
    int i3 = 2100000000;

    //long 2^63
    //byte (-128 to 127)
    byte by1 = 127;
    byte by2 = -128;
    // byte by3 = 128;

    //short (-32768 to 32767)
    short s1 = -32768;
    short s2 = 32767;
    // short s3 = -32769;

    int k1 = 1_000_000;

    //double, float
    double b1 = 100.99;
    float f1 = 100.99f; 
    //less memory to store float value than double value

    // 100.99 or 100.99d (double value)
    // 100.99f (float value)
    // 100L (long value)

    long l20 = 200L;

  }
}