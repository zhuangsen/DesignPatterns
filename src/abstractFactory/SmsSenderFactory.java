package abstractFactory;

public class SmsSenderFactory implements Provider {

	@Override
	public Sender producer() {
		return new SmsSender();
	}

}
