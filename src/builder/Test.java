package builder;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		Bulider bulider = new Bulider();
		bulider.produceMailSender(10);
		
		for(Sender sender : bulider.getList()){
			sender.Send();
		}
	}

}
