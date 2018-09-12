/**
 * author : 王新晨
 * date : 2018年9月12日 下午2:49:13
 */
package dp.factory.method.factory;

import dp.factory.method.IXYJFactory;
import dp.factory.method.IXYJProduct;
import dp.factory.method.product.XYJ02Product;

public class XYJ02Factory implements IXYJFactory{

	@Override
	public IXYJProduct create() {
		return new XYJ02Product();
	}
}
