public class JavaExercise6 {
    public static void main(String[] args) {
     // Print the numbers fulfill the below criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. First ten numbers
    int count = 0;
    for (int i = 0; i < 100; i++) {
      // code here ...
      if(i%2==0 && i%3==0){
        System.out.println(i);
        count ++;
        }
        if(count==10){
          break;
      }
    }
  }
}
