package abstractFactory;

public class Test {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.producer();
		sender.Send();
	}

}
