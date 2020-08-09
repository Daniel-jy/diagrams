/**
 *  懒汉模式单例
 */
public class SingletonLazy {
	//构造方法私有化
	private SingletonLazy() {}
	//私有的类变量
	private static SingletonLazy singleton = null;
	//获取类变量的方法
	public static SingletonLazy getInstance() {
		if(singleton == null) {
			singleton = new SingletonLazy();
		}
		return singleton;
	}
}
