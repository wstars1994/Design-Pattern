/**
 * author : 王新晨
 * date : 2018年9月12日 下午12:08:26
 */
package dp.factory.method;

import dp.factory.method.factory.XYJ02Factory;

/**
 *	工厂方法
 *	隐藏具体产品类的实例化过程，只需要关心产品对应的工厂，无须关心创建细节
 *	加入新产品时，无须修改抽象工厂和抽象产品提供的接口，只要添加一个具体工厂和具体产品就可以
 */
public class Test {
	
	public static void main(String[] args) {
		IXYJFactory factory = new XYJ02Factory();//只需要更换或者添加工厂类即可
		IXYJProduct product = factory.create();
		product.watch();
	}
	
}
