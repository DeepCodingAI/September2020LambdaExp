package payment;

public class PaymentSystems {
    public static void processPayment(){
        System.out.println("Processing customer payment");
        PayByCreditCardWithLambdaExp.processPaymentByCreditCardLambda();

    }
    public class PayByPayPal{
        public void processPaymentByPayPal(){
            System.out.println("Process customer payment by PayPal");
        }
    }
    public class PayByCrypto{
        public void processPaymentByCrypto(){
            System.out.println("Process customer payment by Crypto");
        }
    }
    public static class PayByCreditCard{
        public static void processPaymentByCreditCard(){
            System.out.println("Process customer payment by Credit Card");
            Pay pay = new Pay() {
                @Override
                public void paymentMethod() {
                   System.out.println("System will take credit card");
                }
            };
            pay.paymentMethod();
        }

        public interface Pay{
            public void paymentMethod();
        }
    }

    public static class PayByCreditCardWithLambdaExp{
        public static void processPaymentByCreditCardLambda(){
            System.out.println("Process customer payment by Credit Card");
            Pay pay = () -> System.out.println("System will take credit card");
            pay.paymentMethod();
        }

        public interface Pay{
             void paymentMethod();
        }
    }
}
