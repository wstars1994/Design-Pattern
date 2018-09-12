/**
 * author : 王新晨
 * date : 2018年9月12日 下午4:05:06
 */
package dp.factory.ab4tract.cpu;

import dp.factory.ab4tract.ICpu;

public class CPUCoreI3 implements ICpu{

	@Override
	public String createCpu() {
		return "低性能CPU 酷睿I3";
	}
}
