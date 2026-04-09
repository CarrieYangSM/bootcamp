
public class DemoArray {
  public static void main(String[] args) {
/*
    int age = 10;
    int johnAge = 18;
    int maryAge = 17;

    int[] ages = new int[3]; //array: store a set of same type values
    ages[0] = age;
    ages[1] = johnAge;
    ages[2] = maryAge;

    int tempAge = ages[1];
    ages[1] = ages[2];
    ages[2] = tempAge;

    System.out.printf("JohnAge: %d , MaryAge: %d%n", ages[1], ages[2]);

    for (int i=0; i< ages.length; i++){
      System.out.println(ages[i]);
    }

    int[] arr = new int[100]; // array 0-99

    for (int i=0; i<arr.length; i++){
      arr[i]=i + 100;
      System.out.println(arr[i]);
    }

  char[] chs = new char[4];

  chs[0] = 'a';
  chs[1] = 'b';
  chs[2] = 'c';
  chs[3] = 'd';

  double[] prices = new double[] {99.99, 50.3, 100.0};
  double minPrice = prices[0];

  // 2 questions, 1) start from 1 or 0, comparsion

  for (int i =0; i<prices.length; i++){
    if(minPrice > prices[i]){
      minPrice = prices[i];
    }
  }
    System.out.println(minPrice);


    char[] chs2 = new char[] {'a','e','i','o','u'};
    String name = "Mary";
    //loop: check the name if it contains the char value in chs2
    boolean isFound = false;

   OuterLoop: for (int i=0; i<name.length();i++){
      for (int j=0; j<chs2.length; j++){
          if(name.charAt(i)==chs2[j]){
            isFound = true;
            break OuterLoop;
          }
      }
    }
System.out.println(isFound);

int[] arr2 = new int[] {100, 4, 99, 55, 10};
// int[] arr3 = new int[arr2.length];

for (int i=0; i<arr2.length-1; i++){ //i=0, i=1
  int temp = arr2[i]; //temp = 100 , temp = 100
  arr2[i]=arr2[i+1]; // arr2[0]= 4, arr2[1] = 99
  arr2[i+1] = temp; //arr2[1] = 100, arr2[2] = 100
}

System.out.println(Arrays.toString(arr2));

//sorting
int[] arr3 = new int[]{100, 4, 200, 55, 17};
//move the max number to the tail
int temp2;

for (int i=0;i<arr3.length-1;i++){
  if(arr3[i]>arr3[i+1]){
    temp2 = arr3[i+1];    
    arr3[i+1]=arr3[i];
    arr3[i]=temp2;    
  }
}
System.out.println(Arrays.toString(arr3));

//sorting
// 4, 17, 55, 100, 200
int[] arr4 = new int[] {100, 4, 200, 55,17};

for (int j=0; j<arr4.length-1;j++){
for (int i=0; i<arr4.length-1-j; i++){
  if (arr4[i]>arr4[i+1]){
    int temp3=arr4[i];
    arr4[i]=arr4[i+1];
    arr4[i+1]=temp3;
  }
}
}
System.out.println(Arrays.toString(arr4));

*/

String str="abcdefg";
//reverse the string
String newStr = "";

for (int i=0; i<str.length(); i++){
  newStr += str.charAt(str.length()-1-i);
}
System.out.println(newStr);

  }
}
