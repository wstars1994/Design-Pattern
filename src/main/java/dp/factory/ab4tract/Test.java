/**
 * author : 王新晨
 * date : 2018年9月12日 下午3:06:47
 */
package dp.factory.ab4tract;

import dp.factory.ab4tract.computer.LowComputer;

/**
 *	抽象工厂模式
 *	适用于构建一个拥有多系列不同型的产品
 *	允许客户使用抽象的接口创建一组相关产品，而不需要知道（或者关心）产出的具体产品是什么，这样客户就可以从具体的产品中解耦出来。
 *	一个具体工厂可以创建多个产品，与工厂方法模式相比，可以少产生具体工厂的类数量。
 *	易于交换产品系列，只要更换具体工厂，就可以改变这个产品系列。
 */
public class Test {

	public static void main(String[] args) {
//		IComputerFactory computerFactory = new HighComputer();
		IComputerFactory computerFactory = new LowComputer();
//		IComputerFactory computerFactory = new MediumComputer();
		Computer computer = new Computer();
		ICpu cpu = computerFactory.createCpu();
		IGraphicsCard graphicsCard = computerFactory.createGraphicsCard();
		IMemory memory = computerFactory.createMemory();
		computer.setCpu(cpu);
		computer.setGraphicsCard(graphicsCard);
		computer.setMemory(memory);
		computer.show();
	}
	
}
