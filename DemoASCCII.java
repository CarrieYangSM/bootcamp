public class DemoASCCII{
  public static void main(String[] args) {
    char c1 = 'a';
    // auto-conversion (promotion)
    int asciivalue = 'a';
    System.out.println(asciivalue);
    char c2 ='C';
    int ascivalue2 = '我';
    int ascivalue3 = '8';
    System.out.println(ascivalue3);
    System.out.println(ascivalue2);
    char c3 = 65000;
    System.out.println(c3);

    byte b1 = 100;
    byte b2 = 110;
    int i3 = b1 + b2;
    //byte + byte -> int + int
    //short + short -> int + int
    System.out.println(i3);

    double d1 = 0.1;
    double d2 = 0.2;
    System.out.println(d1 + d2); // 0.30000000000000004  don't sum double values

    int g = 12;
    // post ++
    int k = g++ * 2;
    System.out.println(k); //24
    System.out.println(g); //13

    // pre ++
    int p =10;
    int k2 = ++p *2;
    System.out.println(k2); //22
    System.out.println(p); //11
  }
}
