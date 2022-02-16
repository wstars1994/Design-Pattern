/**
 * author : 王新晨
 * date : 2018年9月12日 下午4:12:06
 */
package dp.factory.ab4tract;

public interface IComputerFactory {

	ICpu createCpu();

	IGraphicsCard createGraphicsCard();

	IMemory createMemory();

}
