package dp.strategy;

/**
 * 描述这个文件的用途
 *
 * @author WStars
 * @date 2022/2/16 11:10
 */
public class BuyClient {

    private IPayStrategy payStrategy;

    public void setPayStrategy(IPayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void toPay(){
        payStrategy.pay();
    }

}
