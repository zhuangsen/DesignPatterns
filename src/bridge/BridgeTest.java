package bridge;

public class BridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		//���õ�һ������
		Sourceable souce1 = new SourceSub1();
		bridge.setSource(souce1);
		bridge.method();
		
		//���õڶ�������
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}
