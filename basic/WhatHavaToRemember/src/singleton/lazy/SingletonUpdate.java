package singleton.lazy;

/**   
 * @Description: 既实现了线程安全,又避免了同步带来的性能影响
 * @author：WUSD
 * @QQ 315787187
 * @date：   2017-3-8 下午01:38:20
 * @version 1.0
 */
public class SingletonUpdate {
	private static class LazyHolder{
		private static final SingletonUpdate INSTANTCE = new SingletonUpdate();
	}
	private SingletonUpdate(){}
	
	//利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗，所以一般我倾向于使用这一种。
	public static final SingletonUpdate getInstance(){
		return LazyHolder.INSTANTCE;
	}
}
