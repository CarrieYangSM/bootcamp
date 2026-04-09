
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {

    public static void main(String[] args) {

        //0.1 + 0.2
        //Solution 1, new BigDecimal("0.1")
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal result = bd1.add(bd2);
        System.out.println(result); //0.3

        double salary = 22500.99;
        double bonus = 1500.99;
        System.out.println(salary = bonus);

        // Solution 2
        BigDecimal result2 = BigDecimal.valueOf(22500.99) //
                .add(BigDecimal.valueOf(1500.99));

        System.out.println(result2);
        // + add
        // - subtract
        // * multiply
        // - divide

        // subtract 0.3-0.1
        BigDecimal result3 = BigDecimal.valueOf(0.3)//
                .subtract(BigDecimal.valueOf(0.1));
        System.out.println(result3);

        // multiply 0.1 x 0.2
        BigDecimal result4 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2));
        System.out.println(result4);

        // divide
        // 1. 10/3 -> 3.3333
        // 2. rounding

        //BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3));
        //System.out.println(result5);

        BigDecimal result5 = BigDecimal.valueOf(10) //
          .divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP); // half -> 5

        System.out.println(result5); //3.33

        BigDecimal result6 = BigDecimal.valueOf(6.7) //
          .divide(BigDecimal.valueOf(2), 1, RoundingMode.DOWN);

        System.out.println(result6); //3.3

        BigDecimal bd3 = BigDecimal.valueOf(10.0);
        BigDecimal bd4 = BigDecimal.valueOf(0.0);

        // risk (Divide Zero) -> avoid
        if(!bd4.equals(BigDecimal.valueOf(0.0))){
          BigDecimal result7 = bd3.divide(bd4, 1, RoundingMode.HALF_DOWN); //
        }else{}
          System.out.println("sorry, bd4 cannot be zero.");
        }
    }
}
