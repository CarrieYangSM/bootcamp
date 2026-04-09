public class DemoMath {
  
  public static void main(String[] args) {

    //PI
    double pi = Math.PI;
    //circle area
    double radius = 3.5;
    double area = radius * radius * pi;
    System.out.println(area);

    //sqrt, square root
    System.out.println(Math.sqrt(9)); //3.0
    System.out.println(Math.sqrt(80)); //8.94427...

    //round, round up
    System.out.println(Math.round(10.453)); //10
    System.out.println(Math.round(10.543)); //11

    //pow, power
    double result = Math.pow(2, 3); //implicit promotion
    System.out.println(result); //8.0

    double bmi = 76 / Math.pow(1.76, 2); //int / double , ok
    System.out.println(bmi);

    // abs
    int x = -2; 
    System.out.println(Math.abs(x)); //2

    //max / min
    int[] arr1 = new int[] {10, 4, 8, 99, -2};
    //find max
    int max = arr1[0];
    int min = arr1[0];

    for (int i=0; i<arr1.length; i++){
   //   if(arr[i]>maxx){
   //     max = arr[i];
   //   }
        max = Math.max(arr1[i], max);
        min = Math.min(arr1[i], min);
    }

    // floor, ceil
    System.out.println(Math.floor(10.9)); // 10.0
    System.out.println(Math.ceil(10.1)); //11.0

    // random()
    double number = Math.random(); //range 0 to 1
    // (Math.random() *1000)+ 100; // 100 -1100
  
    //assignment
    
    //1-49 (random)
    //output: int[] -> 6 numbers (marksix) (no Duplicate)
  }
}
