/**
 * author : 王新晨
 * date : 2018年9月12日 下午4:10:03
 */
package dp.factory.ab4tract;

public class Computer {

	private ICpu cpu;
	private IGraphicsCard graphicsCard;
	private IMemory memory;
	
	public void show() {
		System.out.println(cpu.createCpu());
		System.out.println(graphicsCard.createCard());
		System.out.println(memory.createMemory());
	}

	public ICpu getCpu() {
		return cpu;
	}

	public void setCpu(ICpu cpu) {
		this.cpu = cpu;
	}

	public IGraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(IGraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public IMemory getMemory() {
		return memory;
	}

	public void setMemory(IMemory memory) {
		this.memory = memory;
	}
}
