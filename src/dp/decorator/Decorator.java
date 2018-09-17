/**
 * author : 王新晨
 * date : 2018年9月17日 下午12:23:27
 */
package dp.decorator;

public class Decorator implements IResponse {

	private Response response;
	
	public Decorator(Response response) {
		this.response = response;
	}
	
	@Override
	public void result() {
		this.response.result();
	}
}
