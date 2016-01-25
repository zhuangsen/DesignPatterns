package factoryMethod;

public class FactoryTest {
	public static void main(String[] args) {
		/*SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
		
		sender = factory.produceMail();
		sender.Send();*/
		
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
