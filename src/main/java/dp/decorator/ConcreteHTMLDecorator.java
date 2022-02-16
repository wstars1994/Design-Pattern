/**
 * author : 王新晨
 * date : 2018年9月17日 下午12:25:46
 */
package dp.decorator;

import java.util.Map;

public class ConcreteHTMLDecorator extends Decorator{

	private Response response;
	
	public ConcreteHTMLDecorator(Response response) {
		super(response);
		this.response = response;
	}
	
	@Override
	public void result() {
		Map<String, Object> resMap = response.getResMap();
		System.out.println("这是HTML格式 : "+resMap+",我说是就是!");
	}
	
}
