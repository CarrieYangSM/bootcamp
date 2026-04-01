
public class DemoIf2 {

    public static void main(String[] args) {
      /*
        int age = 13;
        if (age >= 18) {
            System.out.println("greater or equal than 18");
        } else {
            System.out.println("child");
        }
        boolean isElderly = age > 65;
        if (isElderly) {
            System.out.println("Fee is $2");
        } else {
            System.out.println("No discount.");
        }
        // && will group together
        //Event 1: a>20 
        //Event 2:; b>6 && b<20
        int a = 28;
        int b = 21;
        if (a > 20 || b > 6 && b < 20) {
            System.out.println("Hi");
        }

        int x = 9;
        int y = 5;
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);

        int j = 10;
        int k = 5;
        int max;
        if (j > k) {
            max = j;
        } else {
            max = k;
        }
        System.out.println("The max value is:" + max);

        int q = 10;
        int u = 2;
        int t = 1;

        int min;

        if (q > u) {
            if (u > t) {
                min = t;
            } else {
                min = u;
            }
        } else {
            if (q > t) {
                min = t;
            } else {
                min = q;
            }
        }
        System.out.println("The min value is: " + min);
        int score = 80;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'N';
        }
        if (grade == 'A' || grade == 'B') {
            System.out.println("Your grade is: " + grade + " Excellent.");
        } else if (grade == 'C') {
            System.out.println("Your grade is: " + grade + " Pass");
        } else {
            System.out.println("Work Hard");
        }

        String s1 = "Java";

        if (s1.charAt(0) == 'J' || s1.length() > 5) {
            System.out.println("Hello");
        } else {
            System.out.println("byebye");
        }

        String s2 = "a";
        System.out.println(s2.isEmpty());

        if (s2.contains("a")) {
            System.out.println("contains a");
        } else {
            System.out.println("Not contains a");
        }
        String s5 = "Bootcamp";
        s5 = s5.replace('o', 'k');
        s5 = s5.replace("Bkk", "AAA");
        System.out.println(s5);

        String s6 = "Pooy thoon";
        System.out.println(s6.lastIndexOf("oo"));
        System.out.println(s6.lastIndexOf("o"));
        System.out.println(s6.replace(" ", ""));

        String s7 = "Hello";
        String s8 = " World";
        System.out.println(s7.concat(s8));

        String s9 = "abc";
        String s10 = "abc";
        System.out.println(s9.compareTo(s10));
        if (s9.compareTo(s10) == 0) {
            System.out.println("hi hi");
        }
        */
        char gender = 'M';
        switch (gender) {
            case 'M':
                System.out.println("M");
                break;
            case 'F':
                System.out.println("Fx");
                break;
            default:
                System.out.println("ooo");
        }

    }

}
