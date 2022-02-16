/**
 * author : 王新晨
 * date : 2018年9月12日 上午11:52:50
 */
package dp.factory.simple;

public class ATMCartoon implements ICartoon{

	private String name;
	
	public ATMCartoon(String name) {
		this.name = name;
	}
	
	@Override
	public void watch() {
		System.out.println("你开始观看 : "+name);
	}

}
