package SingleObject;

/**
 * 登记式/静态内部类
 * 
 * @author wanglong 达到双检锁方式一样的功效，实现更简单
 *
 */
public class StaticSinglePattern {
	private StaticSinglePattern() {
	}
	
	public static final StaticSinglePattern getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	private static class SingletonHolder {
		private static final StaticSinglePattern INSTANCE = new StaticSinglePattern();
		
	}
}
