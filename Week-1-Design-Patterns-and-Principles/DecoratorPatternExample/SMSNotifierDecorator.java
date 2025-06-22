class SMSNotifierDecorator extends NotifierDecorator{
	public void send() {
		System.out.println("Message from SMS!");
	}
}