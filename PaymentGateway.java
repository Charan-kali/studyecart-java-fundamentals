import java.util.Scanner;

abstract class Payment {
    abstract void pay();
}

class PayPal extends Payment {
    void pay() {
        System.out.println("Payment completed using PayPal");
    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment completed using Credit Card");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment completed using UPI");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment p = null;

        System.out.println("1. PayPal");
        System.out.println("2. Credit Card");
        System.out.println("3. UPI");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                p = new PayPal();
                break;
            case 2:
                p = new CreditCard();
                break;
            case 3:
                p = new UPI();
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        p.pay(); // Runtime Polymorphism
        sc.close();
    }
}