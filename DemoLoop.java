public class DemoLoop {
  public static void main(String[] args) {
 //   for (int i=0; i<3; i++) {
 //       System.out.println("bye");
 //   }

 
    for (int i=0;i<10;i++){
      if (i%2==0){
     //   System.out.println(i);
      }
    }

    for (int j=0; j<100; j++){
      if (j>50 && j%3==0){
        System.out.println(j);
      }
    }
  String s = "hello";
  boolean isTargetExists = false;

  for(int k=0 ; k< s.length();k++){
    if(s.charAt(k)=='l'){
      isTargetExists = true;
      break;
    }
  }  
  System.out.println(isTargetExists);

  String s2= "947052106";
  int max = Integer.MIN_VALUE;

  for (int i=0;i<s2.length();i++){
    int i2 = s2.charAt(i)-'0';
    if(i2%2==0 && i2>max){
      max = i2;
    }
  }
  System.out.println(max);
 
  String s3="83ahs0nd3";

  String output ="";

  for (int i=0; i<s3.length(); i++){
    boolean isAlphabet = s3.charAt(i) >=97 && s3.charAt(i) <=122;
    if(isAlphabet){
        output += s3.charAt(i);
    }
  }
  System.out.println("The output is: " + output);
  
  }
}
