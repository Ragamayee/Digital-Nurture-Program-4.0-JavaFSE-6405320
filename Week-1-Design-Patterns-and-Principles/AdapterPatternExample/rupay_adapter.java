class rupay_adapter implements PaymentProcessor{
	private rupayGateway rupay= new rupayGateway();
	
	@Override
	public void processPayment() {
		System.out.println("Rupay gateway payment processed!");
	}
}