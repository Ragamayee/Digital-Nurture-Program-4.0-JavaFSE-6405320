class Notifier_java{
	
	public static void main(String [] args) {
		SlackNotifierDecorator obj1= new SlackNotifierDecorator();
		obj1.send();
		
		EmailNotifier obj2= new EmailNotifier();
		obj2.send();
		
		SMSNotifierDecorator obj3= new SMSNotifierDecorator();
		obj3.send();
	}
}