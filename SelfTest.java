public class SelfTest{
  public static void main(String[] args) {
    //ascii
    int asciiValue1 = 999999809;
    char c1 = (char) asciiValue1;
    System.out.println("int to char:" + c1);
  
    int asciiValue2 = '哈';
    System.out.println(asciiValue2);

    char c2 = (char) 999999809;
    System.out.println(c2);

    short s1 = 32767;
    short s2 = 3;
    short s3 = (short) (s1 + s2);
    byte b5 = (byte)(s1 + s2);
    int i1 = s1 + s2;
    System.out.println("short plus short (short):" + s3);
    System.out.println("short plus short (integer):" + i1);
    System.out.println("short plus short (byte):" + b5);

    int i3 = 2_147_483_647 + 2; //overflow, loop again
    System.out.println(i3);

    byte b = 127;
    byte b2 = 9;
    byte b3 = (byte) (b + b2);
    int i4 = b + b2;
    int i5 = b;
    short s4 = (short) (b + b2);

    double d1 = 999.99;
    float f1 = (float) d1;

    float f2 = 999.99f;
    double d2 = f2;

    System.out.println("float value:" + f1);
    System.out.println("double value:" + d2);
//if
    int age = 20;
    boolean isAdult = age>21;
    if(isAdult){
      System.out.println("You are Adult.");
    }
  }
} 
