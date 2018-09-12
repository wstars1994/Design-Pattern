/**
 * author : 王新晨
 * date : 2018年9月12日 下午3:06:47
 */
package dp.factory.ab4tract;

import dp.factory.ab4tract.computer.HighComputer;
import dp.factory.ab4tract.computer.LowComputer;
import dp.factory.ab4tract.computer.MediumComputer;

/**
 *	抽象工厂模式
 *	适用于构建一个拥有多系列不同型的产品
 */
public class Test {

	public static void main(String[] args) {
//		IComputerFactory computerFactory = new HighComputer();
		IComputerFactory computerFactory = new LowComputer();
//		IComputerFactory computerFactory = new MediumComputer();
		Computer computer = computerFactory.create();
		computer.show();
	}
	
}
