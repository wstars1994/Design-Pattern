/**
 * author : 王新晨
 * date : 2018年9月12日 上午11:52:22
 */
package dp.factory.simple;

public class HuLuWaCartoon implements ICartoon{

	private String name;
	
	public HuLuWaCartoon(String name) {
		this.name = name;
	}
	
	@Override
	public void watch() {
		System.out.println("你开始观看 : "+name);
	}

}
