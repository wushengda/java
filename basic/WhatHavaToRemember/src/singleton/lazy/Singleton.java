package singleton.lazy;
/**   
 * @Title: Singleton.java 
 * @Package lazy 
 * @Description: 懒汉式单例模式(会延迟加载,在第一次使用该单例的时候才会实例化对象出来,第一次调用时要做初始化,之后就会和饿汉式一样了)
 * @author：WUSD
 * @QQ 315787187
 * @date：   2017-3-8 下午01:32:39
 * @version 1.0
 */
public class Singleton {
	private static Singleton obj = null;
	
	private Singleton(){};
	
	//在getInstance中做了两次null检查，确保了只有第一次调用单例的时候才会做同步，这样也是线程安全的，同时避免了每次都同步的性能损耗
	public static Singleton getInstance(){
		if(obj == null){
			/**
			 * code
			 * code
			 * code
			 * code
			 */
			synchronized(Object.class){
				if(obj==null){
					obj = new Singleton();
				}
			}
		}
		return obj;
	}	
}
