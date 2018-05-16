package SingleObject;

/**
 * 
 * @author wanglong
 * 懒汉式
 * 线程安全
 * 支持多线程，工作效率低，99%不需要同步
 * 优点： 第一次调用初始化，避免内存浪费
 * 缺点： 必须加锁，才能保证单例，但会影响效率
 * 
 * 
 * 
 */
public class LazySyncSinglePattern {
	private static LazySyncSinglePattern instance;

	private LazySyncSinglePattern() {
	}

	public static synchronized LazySyncSinglePattern getInstance() {
		if (instance == null) {
			instance = new LazySyncSinglePattern();
		}
		return instance;
	}
}
