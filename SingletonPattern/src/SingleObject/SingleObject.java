package SingleObject;

public class SingleObject {
	// 创建一个SingleObject对象
	private static SingleObject instance = new SingleObject();
	
	// 构造函数私有，使无法外部实例化
	private SingleObject() {
	}
	
	// 获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("hello world");
	}
}
