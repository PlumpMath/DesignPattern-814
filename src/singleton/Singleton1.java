package singleton;

public class Singleton1 {
	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */
	private static Singleton1 instance = null;
	/* ˽�й��췽������ֹ��ʵ���� */
	private Singleton1(){
	}
	/* ��̬���̷���������ʵ�� */
	public static synchronized Singleton1 getInstance(){
		if(instance==null)
			instance = 	new Singleton1();
		return instance;
	}
}
