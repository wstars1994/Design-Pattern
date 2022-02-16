/**
 * author : 王新晨
 * date : 2018年9月12日 下午2:50:25
 */
package dp.factory.method.product;

import dp.factory.method.IXYJProduct;

public class XYJ95Product implements IXYJProduct{

	@Override
	public void watch() {
		System.out.println("欢迎收看95版西游记之大话西游,主演:周星驰");
	}
}
