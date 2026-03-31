public class PrimitivesMath{
  public static void main(String[] args){
    int count = 3;
    int price = 10;
    int total = count * price;
    System.out.println(total);

    int totalScore = 750;
    int peopleCount = 8;

    int average = totalScore / peopleCount;
    System.out.println(average);

    double average2 = totalScore / peopleCount;
    System.out.println(average2);

    double totalScore2 = 750;
    double peopleCount2 = 8;
    double average3 = totalScore2 / peopleCount2;
    System.out.println(average3);

    System.out.println();
    System.out.println();
    //short cut just input Sysout then press enter

    byte b1 = -128;
    b1 = (byte) (b1 -1); // assign -131 into b1, 127
    System.out.println(b1);
    b1 = (byte)(b1 -3); // 125 (overflow) "(byte)" I take my own risk
    System.out.println(b1);

    int amount = 2_100_000_000;
    amount = amount + 100_000_000;
    System.out.println(amount);

    amount = 2_100_000_000;
    long amount2 = amount + 100_000_000L; //int value + long value > long value
    long amount3 = 23_100_000_000L;
    System.out.println(amount2);
    System.out.println(amount3);

  }
}