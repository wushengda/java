package singleton.hungry;

//饿汉式单例模式,再类初始化时,已经自动实例化
/**   
 * @Title: Singleton.java 
 * @Package hungry 
 * @Description: 饿汉式单例模式(线程安全,可以直接用于线程安全,只是在创建类的同时实例化一个静态对象出来,不管之后会不会用这个单利,都会占据一定的内存空间)
 * @author：WUSD
 * @QQ 315787187
 * @date：   2017-3-8 下午01:42:31
 * @version 1.0
 */
public class Singleton {
	private Singleton(){}
	private static final Singleton single = new Singleton();
	//静态工厂方式
	public static Singleton getInstance(){
		return single;
	}
}
