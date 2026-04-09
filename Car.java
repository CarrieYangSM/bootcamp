public class Car {
  private String color;
  private String brand;
  private String year;

  public String getColor(){
    return this.color;
  }

  public String getBrand(){
    return this.brand;
  }

  public String getYear(){
    return this.year;
  }

  public void setColor(String color){
    this.color = color;
  }

  public void setBrand(String brand){
    this.brand = brand;
  }

   public void setYear(String year){
    this.year = year;
   }

  public static void main(String[] args) {
    Car c1= new Car();
    c1.setColor("blue");
    c1.setBrand("tesla");
    c1.setYear("2019");

    Car c2 = new Car();
    c2.setColor("red");
    c2.setBrand("BYD");
    c2.setYear("2018");

    System.out.printf("Car 1: Color: %sc Brand: %s Year:%s", c1.getColor(), c1.getBrand(), c1.getYear());

  }
}
