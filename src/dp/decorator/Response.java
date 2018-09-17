/**
 * author : 王新晨
 * date : 2018年9月17日 下午12:22:10
 */
package dp.decorator;

import java.util.Map;

public class Response implements IResponse {

	private Map<String, Object> resMap = null;
	
	public Response(Map<String, Object> resMap) {
		this.resMap = resMap;
	}

	@Override
	public void result() {
		System.out.println(resMap.toString());
	}

	public Map<String, Object> getResMap() {
		return resMap;
	}
}
