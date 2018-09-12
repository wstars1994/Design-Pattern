/**
 * author : 王新晨
 * date : 2018年9月12日 下午4:13:44
 */
package dp.factory.ab4tract.computer;

import dp.factory.ab4tract.Computer;
import dp.factory.ab4tract.IComputerFactory;
import dp.factory.ab4tract.ICpu;
import dp.factory.ab4tract.IGraphicsCard;
import dp.factory.ab4tract.IMemory;
import dp.factory.ab4tract.card.GCardGTX1060;
import dp.factory.ab4tract.cpu.CPUCoreI3;
import dp.factory.ab4tract.memory.Memory4G;

public class LowComputer implements IComputerFactory{

	@Override
	public Computer create() {
		ICpu cpu = new CPUCoreI3();
		IMemory memory = new Memory4G();
		IGraphicsCard graphicsCard = new GCardGTX1060();
		Computer computer = new Computer();
		computer.setCpu(cpu);
		computer.setGraphicsCard(graphicsCard);
		computer.setMemory(memory);
		return computer;
	}

}
