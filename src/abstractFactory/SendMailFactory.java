package abstractFactory;

public class SendMailFactory implements Provider {

	@Override
	public Sender producer() {
		return new MailSender();
	}

}
