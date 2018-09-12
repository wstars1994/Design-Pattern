/**
 * author : 王新晨
 * date : 2018年9月12日 下午2:50:25
 */
package dp.factory.method.product;

import dp.factory.method.IXYJProduct;

public class XYJ02Product implements IXYJProduct{

	@Override
	public void watch() {
		System.out.println("欢迎收看2002版西游记之齐天大圣孙悟空,主演:张卫健");
	}
}
