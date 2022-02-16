/**
 * author : 王新晨
 * date : 2018年9月12日 下午4:05:06
 */
package dp.factory.ab4tract.memory;

import dp.factory.ab4tract.IMemory;

public class Memory4G implements IMemory{

	@Override
	public String createMemory() {
		return "低性能内存条 4G";
	}
}
