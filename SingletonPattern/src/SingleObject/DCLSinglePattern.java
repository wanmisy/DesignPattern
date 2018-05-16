package SingleObject;

/**
 * 双检锁/双重校验锁 安全在多线程的情况下能保持高性能
 * 
 * @author wanglong
 * 
 *         getInstance()性能对应用程序很关键
 *
 */
public class DCLSinglePattern {
	private volatile static DCLSinglePattern instance;

	private DCLSinglePattern() {
	}

	public static DCLSinglePattern getInstance() {
		if (instance == null) {
			synchronized (DCLSinglePattern.class) {
				if (instance == null) {
					instance = new DCLSinglePattern();
				}

			}
		}
		return instance;
	}
}
