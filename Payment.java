interface Payment {
  void pay(double amount);
}

class CreditCardPayment implements Payment {
  public void pay(double amount) {
    System.out.println("Paid ₹" + amount + " using Credit Card");
  }
}

class UPIPayment implements Payment {
  public void pay(double amount) {
    System.out.println("Paid ₹" + amount + " using UPI");
  }
}

class NetBankingPayment implements Payment {
  public void pay(double amount) {
    System.out.println("Paid ₹" + amount + " using Net Banking");
  }
}

public class Main {
  public static void main(String[] args) {

    Payment payment;

    payment = new CreditCardPayment();
    payment.pay(2500);

    payment = new UPIPayment();
    payment.pay(1500);

    payment = new NetBankingPayment();
    payment.pay(3000);
  }
}