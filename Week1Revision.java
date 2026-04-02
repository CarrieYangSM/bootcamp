public class Week1Revision{
  public static void main(String[] args) {
    // System.out.println();
    // 8 Primitives + String
    // int, char, double, short, long, byte, float, boolean + string
    byte b1 = 5; // -128 to 127
    //equalsIgnoreCase, retruns boolean
    String s1 = "abc";
    String s2 = "bcd";
    System.out.println(s1.equalsIgnoreCase(s2));
    //compareTo, return int
    System.out.println(s1.compareTo(s2));
    //trim, return string
    String s3 = "  kkk ";
    System.out.println(s3.trim());
    //isEmpty
    System.out.println(" ".isEmpty());
    //isBlank
    System.out.println("".isBlank());
    //lastIndexOf, return int
    System.out.println("abc".lastIndexOf("c"));
    //concat, string
    System.out.println("abc".concat(" def"));
    //toLowerCase, toUpperCase
    System.out.println(("abc".toUpperCase()));

    char ch2 = 'a';
    int ascii = ch2 + 1;
    char ch3 = (char) (ch2 + 70000);
    System.out.println(ch3);
    int a =10;
    System.out.println(++a + a++ *3);// 11 + 11 *3
    System.out.println(a); // 10 + 1 +1


  }
}