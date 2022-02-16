/**
 * author : 王新晨
 * date : 2018年9月17日 下午12:15:06
 */
package dp.decorator;

import java.util.HashMap;
import java.util.Map;


/**
 *	装饰器 - 类功能扩展
 *
 *	被扩展类与装饰类实现统一接口,在具体装饰类中通过组合方式扩展原类功能.所以,并不是在被增强类中扩展而是在具体装饰类中扩展
 *	
 *	不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能
 *
 *	例子 : 将response返回的结果转换为 json/html
 */
public class Test {

	public static void main(String[] args) {
		Map<String, Object> resMap = new HashMap();
		resMap.put("code", 0);
		resMap.put("msg", "success");
		//被增强类
		Response response = new Response(resMap);
		//ConcreteJSONDecorator ConcreteHTMLDecorator 具体装饰类
		IResponse concreteJSONDecorator = new ConcreteJSONDecorator(new Response(resMap));
//		IResponse concreteJSONDecorator = new ConcreteHTMLDecorator(response);
		concreteJSONDecorator.result();
	}
}
