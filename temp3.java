public class temp3 {
  public static void main(String[] args) {
    String s2 = "940052108"; //Find the largest even digit
    int maxEvenNumber = Integer.MIN_VALUE;

for (int i=0;i<s2.length();i++){
    int stringInt = s2.charAt(i);
    if(stringInt%2==0 && stringInt>maxEvenNumber){
      maxEvenNumber = stringInt;
    }
}
char c1=(char)maxEvenNumber;
System.out.println("The largest even digit is " + c1);
  }
}
