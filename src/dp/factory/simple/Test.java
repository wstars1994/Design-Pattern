/**
 * author : 王新晨
 * date : 2018年9月12日 上午11:44:35
 */
package dp.factory.simple;

/**
 * 	简单工厂
 * 	可扩展性差,不适用于大量产品
 */
public class Test {

	public static void main(String[] args) {
		ICartoon watch = SimpleCartoonFactory.watch(SimpleCartoonFactory.ATM);
		ICartoon watch2 = SimpleCartoonFactory.watch(SimpleCartoonFactory.QZGS);
		ICartoon watch3 = SimpleCartoonFactory.watch(SimpleCartoonFactory.HULUWA);
		watch.watch();
		watch2.watch();
		watch3.watch();
	}

}
