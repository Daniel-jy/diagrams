/**
 *  饿汉模式单例
 */
public class SingletonHungry {
	//构造方法私有化
	private SingletonHungry() {}
	//私有的类变量
	private static SingletonHungry singleton = new SingletonHungry();
	//获取类变量的方法
	public static SingletonHungry getInstance() {
		return singleton;
	}
}
