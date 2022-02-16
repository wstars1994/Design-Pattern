/**
 * author : 王新晨
 * date : 2018年9月12日 下午4:03:35
 */
package dp.factory.ab4tract.card;

import dp.factory.ab4tract.IGraphicsCard;

public class GCardGTX1080 implements IGraphicsCard{

	@Override
	public String createCard() {
		return "高性能显卡 GTX1080";
	}

}
