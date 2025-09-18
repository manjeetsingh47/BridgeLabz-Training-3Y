package workshop_16_09_25;

class Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " initiated.");
    }
}


class CreditCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

class DebitCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Debit Card.");
    }
}


class UPI extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}


public class PaymentGateway {
    public static void main(String[] args) {
        Payment payment;  

        payment = new CreditCard();
        payment.pay(1000);

        payment = new DebitCard();
        payment.pay(2000);

        
        payment = new UPI();
        payment.pay(500);
    }
}






