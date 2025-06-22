class SlackNotifierDecorator extends NotifierDecorator{
	public void send() {
		System.out.println("Message from Slack!");
	}
}