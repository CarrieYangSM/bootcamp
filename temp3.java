

public class temp3 {
public static void main(String[] args){
/* 
    System.out.println("hello");
    byte b = 1; 
    short s = Short.MAX_VALUE;
    int i = 2_100_000_000;
    long l = 2_200_000_000L;
    char ch = 'a';
    float f = 10.99f;
    double d = 10.99;
    String c = "hello";
    boolean bo = true;
    b = 126;
    byte b1 = (byte) (b +1);
    i = b +1;
    System.out.printf("The int is %d%n", i);
    i =s+1;
    s = (short) (s+1);
    System.out.printf("The short (overflow) is %d and the int is: %d%n",s,i);
    d = 0.1*10;
    double d1 = 0.2*10;
    i = (int) d;
    int i2 = (int) d1;
    d = d + d1;
 
    System.out.println(d/10);
    System.out.printf("The length is %d, the first and the last characters is %s and %s%n", c.length(), c.substring(0,1), c.substring(c.length()-1));
    System.out.printf("The idex of o is %d%n",c.indexOf('o'));
    System.out.printf("The substring (0,3) is %s%n", c.substring(0, 3));
    System.out.printf("Replace \"ll\" to \"xxx\" is %s%n", c.replace("ll", "xxx"));
    System.out.printf("Is it startWith \"he\": %s Is it endWith \"llo\": %s%n", c.startsWith("he"), c.endsWith("llo"));

    byte b3 = 1; 
    short s3 = Short.MAX_VALUE; 
    int i3 = b3 + s3;
    s3 = (short)(b3 + s3);
    System.out.printf("The short is: %d and the integer is: %d%n", s3, i3);
    int n = 2_100_000_000; 
    long total = n + 100_000_000L;
    System.out.println(total);
    int total2 = n + 100_000_000;
    System.out.println(total2);

    char c4 = 'a';
    System.out.println(c4 + 1);
    char c5 = 'a' + 1;
    System.out.println(c5);
    System.out.println((char)(c4 + 65535 +1));

 
    int a = 10;
    System.out.println(++a + a++ *3); //44
    System.out.println(a);
     a = 11
     11 + 33 = 44
     a = 12
 
    String s5 = "hello";
    String s6 = new String("hello");
    System.out.println(s5==s6);
    System.out.println(s5.equals(s6));

    String s7 = " Hello World. ";
    System.out.println(s7.trim() + s7.toLowerCase() + s7.isBlank() + s7.isEmpty());

Given price and quantity compute amount and apply discounts:
amount >= 1000 => 20% off
amount >= 500 => 10% off
otherwise 5% off
Print final amount. (Note: the notes had swapped 10%/20% — reproduce the correct logic and mention correct percentages.)


double price = 0.00;
int quantity = 1;

double finalAmount;
double discount;

Scanner s = new Scanner(System.in);
System.out.println("What is the price?");
price = s.nextDouble();
System.out.println("How many do you want?");
quantity = s.nextInt();

double amount = price * quantity;

if(amount >= 1000.00){
  discount =  0.2;
} else if (amount >= 500.00){
  discount = 0.1;
} else {
  discount = 0.05;
}

finalAmount = amount * (1-discount);

System.out.printf("finalAmount is %.2f",finalAmount);

System.out.println();

 
Use a switch on a char grade variable (A, B, others) to print the appropriate message. Include 'break' statements.

Scanner scanner = new Scanner(System.in);
System.out.println("what is your grade A, B, C or D");
String grade = scanner.next(); 

switch (grade){
  case "A":
    System.out.println("Excellent");
    break;
  case "B":
    System.out.println("Good");
    break;
  case "C":
    System.out.println("Passed");
    break;
  default:
    System.out.println("Failed");
}

String s = "hello";
String evenIndexString = "";
String oddIndexString = "";

for (int i=0; i<s.length();i++){
  if (i%2==0){
    evenIndexString += s.charAt(i);
  } else {
    oddIndexString += s.charAt(i);
  }
}
System.out.printf("The even Index string is %s and the odd Index string is %s%n", evenIndexString, oddIndexString);

Scanner s2 = new Scanner(System.in);
System.out.println("please input a string");
String s = s2.next();

int countL=0;

for (int i=0; i<s.length();i++){
  if (s.charAt(i)=='l'){
    countL ++;
  }
}
System.out.println("The number of letter l is " + countL);

String s = "A man a plan a canal Panama".replace(" ","").toLowerCase();
String ps = "";

for (int i = s.length()-1; i>=0;i--){
  ps+=s.charAt(i);
}
  System.out.println(s.equals(ps));
*/


  String s = "aabbbccdda";
  String s2 ="";
  int count = 1;
  char temp = s.charAt(0); //temp = 'a'

  for (int i=1; i<s.length();i++){ // i = 7
      if(temp==s.charAt(i)){  //false
        count ++; // count =2
      }else{
        s2 += temp + Integer.toString(count); //s2 = a3b2c
        temp = s.charAt(i); //
        count=1;  //
        }
  }
  
  s2 += temp + Integer.toString(count);        
  System.out.println(s2);  



//ccadegga
/* 
Scanner scanner = new Scanner(System.in);
System.out.println("input a string");
String answerString = scanner.next();
String resultString = "";

for (int i=0; i<answerString.length(); i++){ 
    String temp = Character.toString(answerString.charAt(i));
    if(!resultString.contains(temp)){
      resultString += temp;
    }
}
System.out.println(resultString);


Scanner scanner = new Scanner(System.in);
System.out.println("please input an integer value");
String s = scanner.next();

try {
  int i = Integer.parseInt(s);
  System.out.println("ok");
} catch (NumberFormatException e) {
  System.out.println("Error");
}



*/

}
}