class paypal_adapter implements PaymentProcessor{
	private paypalGateway paypal= new paypalGateway();
	
	@Override
	public void processPayment() {
		System.out.println("Paypal gateway payment processed!");
	}
}