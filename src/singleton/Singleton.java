package singleton;

public class Singleton {
	//	����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ���
	private static Singleton instance = null;
	
	//˽�й��죬��ֹ��ʵ����
	private Singleton(){
		
	}
	
	/**
	 * ��̬���̷���������ʵ��
	 * @return
	 */
/*	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}*/
	
/*	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	*/
	
/*	public static Singleton getInstance(){
		if(instance == null){
			synchronized(instance){
				instance = new Singleton();
			}
		}
		return instance;
	}*/
	
	/**
	 * ʹ��һ���ڲ�����ά������
	 * @author zhuangsen
	 *
	 */
	private static class SingletonFactory{
		private static Singleton instance = new Singleton();
	}
	
	/**
	 * ��ȡʵ��
	 * @return
	 */
	public static Singleton getInstance(){
		return SingletonFactory.instance;
	}
	
	
	/**
	 * ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
	 * @return
	 */
	public Object readResolve(){
		return instance;
	}
}
