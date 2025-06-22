public class payment_test{
	public static void main(String [] args) {
		PaymentProcessor paypal_pay= new paypal_adapter();
		paypal_pay.processPayment();
		
		PaymentProcessor rupay_pay= new rupay_adapter();
		rupay_pay.processPayment();
	}
}

