
import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {
    // id

    private String firstName;
    private String lastName;
    private char gender; //'M', 'F'
    private LocalDate dob;
    private Order[] orders; //Array (Customer Class)

    // isVip(), total amount for all orders > 100,000
    // true / false
    public boolean isVip() {
        return this.totalOrderAmount() > 100_000;
    }

    public void setOrder(Order[] orders) {
        this.orders = orders;
    }

    public double totalOrderAmount() {
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < this.orders.length; i++) {
            //Order order = orders[i];
            //double totalamount = order.totalAmount();
            sum = sum.add(BigDecimal.valueOf(this.orders[i].totalAmount()));
        }
        return sum.doubleValue();
    }

    //constructor > produce object
    // implicity empty constructor
    public Customer() {
        System.out.println("creating customer...");
    }

    //More than one constructor
    public Customer(String firstName, String lastName, char gender, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(Order[] orders) {
        this.orders = orders;
    }

    public LocalDate getDOB() {
        return this.dob;
    }

    public int getBirthYear() {
        return this.dob.getYear();
    }

    public String customerInfo() {
        return "First name: " + this.firstName + " Last Name: " + this.lastName + " Gender: " + this.gender + " Date of Birth: " + this.dob;
    }

    public static void main(String[] args) {

        //"new" -> product object (call constructor)
        Customer c1 = new Customer();
        Customer c2 = new Customer("John", "Chan", 'M', LocalDate.of(1990, 1, 1));
        System.out.println(c2.customerInfo());
        System.out.println(c1.customerInfo()); //null
        System.out.println(c2.getBirthYear()); // 1990

        Item item1 = new Item("Table", 3_000.0, 3);
        Item item2 = new Item("Television", 80_000.0, 2);

        Order order1 = new Order(new Item[]{item1, item2});

        Item item3 = new Item("Air conditioner", 3_000, 1);
        Order order2 = new Order(new Item[]{item3});

        Customer c4 = new Customer(new Order[]{order1, order2});

        System.out.println("Is this customer a VIP? " + c4.isVip());

    }

}
