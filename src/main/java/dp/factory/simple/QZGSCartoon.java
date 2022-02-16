/**
 * author : 王新晨
 * date : 2018年9月12日 上午11:52:35
 */
package dp.factory.simple;

public class QZGSCartoon implements ICartoon{

	private String name;
	
	public QZGSCartoon(String name) {
		this.name = name;
	}
	
	@Override
	public void watch() {
		System.out.println("你开始观看 : "+name);
	}
}
