abstract class PaymentProcessor {

    public abstract void processTransaction(double amount);
}

class CreditCardProcessor extends PaymentProcessor {

    public void processTransaction(double amount) {
        System.out.println("Credit Card Payment");
        System.out.println("Validating card details...");
        System.out.println("Charging amount: Rs." + amount);
        System.out.println();
    }
}

class PayPalProcessor extends PaymentProcessor {

    public void processTransaction(double amount) {
        System.out.println("PayPal Payment");
        System.out.println("Authenticating PayPal account...");
        System.out.println("Transferring amount: Rs." + amount);
        System.out.println();
    }
}

class CryptoProcessor extends PaymentProcessor {

    @Override
    public void processTransaction(double amount) {
        System.out.println("Cryptocurrency Payment");
        System.out.println("Verifying  transaction...");
        System.out.println("Sending crypto equivalent of Rs." + amount);
        System.out.println();
    }
}

public class Payment {

    public static void main(String[] args) {

        PaymentProcessor[] processors = {
            new CreditCardProcessor(),
            new PayPalProcessor(),
            new CryptoProcessor()
        };

        double amount = 5000.0;

        for (PaymentProcessor processor : processors) {
            processor.processTransaction(amount);
        }
    }
}