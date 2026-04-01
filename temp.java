public class temp {
  public static void main(String[] args) {
  /* 
    //print even number
    for (int i = 0; i < 10; i++) {
        if (i%2==0){
          System.out.println(i);
        }
    }
  //print the numbers between 0 -99, which divided by 3, and it is greater than 50
  for (int i=0; i<100;i++){
    if (i>50 && i%3==0){
      System.out.println(i);
    }
  }
  
  //hello
  //Find if character 'l' exists
  String s1 = "heao";
  boolean isTargetExists = false;
  for (int i=0; i<s1.length();i++){
    if(s1.charAt(i)=='l'){
        isTargetExists = true;
        break;
    }
  } 
    if(isTargetExists){
      System.out.println("There is letter l");
    }else{
      System.out.println("There is no letter l");
    }
  
String s2 = "940052108"; //Find the largest even digit
int maxEvenNumber = Integer.MIN_VALUE;

for (int i=0;i<s2.length();i++){
    int stringInt = s2.charAt(i)-'0';
    
    if(stringInt%2==0 && stringInt>maxEvenNumber){
      maxEvenNumber = stringInt;
    }
}
System.out.println("The largest even digit is " + maxEvenNumber);

String s3 = "8A3ahs0nd3";
//ahsnd
String output = "";

for (int i=0; i<s3.length();i++){
  boolean isAlphabet = s3.charAt(i)>=97 && s3.charAt(i)<=122;
  if(isAlphabet){
      output += s3.charAt(i);
  }
}
System.out.println(output);
*/

//"725094849" Find the largest index of the largest digit, 8
String s = "725094940";
int maxValue = s.charAt(0)-'0';
int maxValueLocation = 0;
for (int i = 1; i < s.length(); i++) {
    if (maxValue<=(s.charAt(i)-'0')){
      maxValue = (s.charAt(i)-'0');
      maxValueLocation = i;
    }
} System.out.println("The largest index is " + maxValueLocation + " and the largest digit is " + maxValue);

  }
  }
