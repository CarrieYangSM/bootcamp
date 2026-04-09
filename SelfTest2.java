public class SelfTest2 {
  public static void main(String[] args) {
 /*  
   byte b = 127;
    short s = 30000;
    int i = 2_100_000_000;
    long l = 2_200_000_000L;
    float f = 10.99f;
    double d = 10.99;
    boolean bo = true;
    char c = 'Z';
    System.out.println(b +"," + s +"," + i + "," + f +"," + d + "," + bo + "," + c);

   int + long > long, ok
   overflow, ok
   30_100

  0.3xxxxxxxx
  System.out.println((double)(0.1+0.2));

  String message = "   Java Bootcamp 2026. ";
  System.out.println(message.trim());
  System.out.println(message.toUpperCase());
  

  System.out.println(message.contains("Java"));
  System.out.println(message.replace("2026","2027"));
  System.out.println(message.indexOf(10));
  System.out.println(message.startsWith("Java"));
  System.out.println(message.trim().endsWith("2026."));
  System.out.println(message.trim().length());
  System.out.println(message.length());

  String email = "carrie123@gmail.com";
  int nameIndex = email.indexOf("@");
  System.out.println(email.substring(0,nameIndex));
  System.out.println(email.substring(nameIndex+1));
  System.out.println(email.contains("gmail"));
  System.out.println(email.substring(0,nameIndex).length());

false
true
false
true

24
7

double price = 129.99;
int quantity = 12;

double amount = price * quantity;

double discount=0.0;

 
if(amount<300){
  discount = 0.0;
} else if (amount>= 300 && amount < 800){
  discount = 0.08;
} else if (amount >=800 && amount < 1500){
  discount = 0.15;
} else{
  discount = 0.25;
}

amount *= amount * (1-discount);

if(amount>=1500){
  System.out.println("Original:$ " + price +"| Final: $" + amount + "| Discount: " + discount*100 +"%");
}

char grade;
switch (grade){
  case 'A':
    System.out.println("Excellent");
    break;
  case 'B':
    System.out.println("Very Good");
    break;
  case 'C':
    System.out.println("Pass");
    break;
  case 'D':
    System.out.println("Fail");
    break;
  case 'E':
    System.out.println("Very bad");
    break;
  case 'F':
    System.out.println("work hard");
    break;
  default:
    System.out.println("Invalid grade.");
}
int k;
for (int i = 1; i<6; i++){
  System.out.println(i);
  }
}

*/

int countUpper =0;
int countDigit =0;
String removeDigit = "";
char ch;
String text = "JavaIsFun2026";
for (int i=0; i<text.length();i++){
  ch = text.charAt(i);
  System.out.println(i + " " + ch);
  if(ch>=65 && ch<=90){
    countUpper ++;
  }
  if(ch>=48 && ch<=56){
    countDigit ++;
  }
  else{
    removeDigit += ch;
  }
}
System.out.println(countUpper);
System.out.println(countDigit);
System.out.println(removeDigit);

String name = "Carrie";
System.out.println("Hello ".concat(name));
System.out.println(name.length());
System.out.println(name.charAt(0) + " " + name.charAt(name.length()-1));

for (int i = 1; i<6; i++){
  for (int j = 1; j<=i; j++){
    System.out.print(i);
  } System.out.println();
}


}
}
