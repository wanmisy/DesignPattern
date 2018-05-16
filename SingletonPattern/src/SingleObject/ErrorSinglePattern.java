package SingleObject;

/**
 * 恶汉式
 * 
 * @author wanglong 
 * 支持多线程 
 * 
 * 优点：未加锁，执行效率会提高 
 * 缺点： 类加载时就初始化，浪费内存
 * 
 */
public class ErrorSinglePattern {
	private static ErrorSinglePattern instance = new ErrorSinglePattern();

	private ErrorSinglePattern() {
	}
	
	public static ErrorSinglePattern getInstance() {
		return instance;
	}

}
