package state;

/**
 * 状态类的和心类
 * @author zhuangsen
 *
 */
public class State {

	private String value;
	
	public void method1(){
		System.out.println("execute the first opt!");
	}
	public void method2(){
		System.out.println("execute the secont opt!");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
