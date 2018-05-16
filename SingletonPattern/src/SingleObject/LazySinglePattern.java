package SingleObject;

/**
 * 
 * @author wanglong
 * 懒加载
 * 不支持多线程
 *
 */
public class LazySinglePattern {
	private LazySinglePattern() {
	}
	
	private static LazySinglePattern instance;
	
	public LazySinglePattern getInstance() {
		if (instance == null) {
			instance = new LazySinglePattern();
		}
		return instance;
	}
}
