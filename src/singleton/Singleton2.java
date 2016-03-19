package singleton;

public class Singleton2 {
	/* ˽�й��췽������ֹ��ʵ���� */
	private Singleton2(){
	}
	/* �˴�ʹ��һ���ڲ�����ά������ */
	private static class SingletonHolder{
		private static final Singleton2 instance = new Singleton2();
	}
	/* ��ȡʵ�� */
	public static Singleton2 getInstance(){
		return SingletonHolder.instance;
	}
}
