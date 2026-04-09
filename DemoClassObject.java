public class DemoClassObject {
  public static void main(String[] args) {

    String phoneNumber = "+852 123456";
    String emailAddress = "vincentlau@gmail.com";
    String weChatId = "vincentlau";
    String whatsappNumber = "+852 123456";

    String[] tutor= new String[] {"+852 123456","vincentlau@gmail.com","vincentlau","+852 123456"};

    Tutor t1 =new Tutor(); //product a tutor object
    t1.setEmailAddress("sallychan@gmail.com");

    Tutor t2=new Tutor();
    t2.setEmailAdress("leolau@gmail.com");

    String t2Email = t2.getEmailAddress();
    System.out.println(t2Email);
  }
}
