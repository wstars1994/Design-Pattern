/**
 * author : 王新晨
 * date : 2018年9月12日 上午11:54:38
 */
package dp.factory.simple;

public class SimpleCartoonFactory {

	public static final int QZGS = 1;
	public static final int HULUWA = 2;
	public static final int ATM = 3;
	
	public static ICartoon watch(int type) {
		ICartoon cartoon = null;
		switch (type) {
		case QZGS:
			cartoon = new QZGSCartoon("全职高手");
			break;
		case HULUWA:
			cartoon = new QZGSCartoon("葫芦娃");
			break;
		case ATM:
			cartoon = new QZGSCartoon("奥特曼");
			break;
		}
		return cartoon;
	}
}
