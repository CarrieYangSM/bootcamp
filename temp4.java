public class temp4{

public static void main(String[] args) {
  
        double price = 129.99;
        int quantity = 12;
        double amount = price * quantity;

        double discountRate = 0;
        String message = "";

        if (amount >= 1500) {
            discountRate = 0.25;
            message = " + Free shipping!";
        } else if (amount >= 800) {
            discountRate = 0.15;
        } else if (amount >= 300) {
            discountRate = 0.08;
        } else {
            discountRate = 0;
        }

        double finalAmount = amount * (1 - discountRate);

        System.out.printf("Original: $%.2f | Final: $%.2f | Discount: %.0f%%%s%n",
                amount, finalAmount, discountRate * 100, message);
        System.out.println("Original: " + amount + "| Final:" + finalAmount+ "| Discount:" + discountRate);
    
  }
}