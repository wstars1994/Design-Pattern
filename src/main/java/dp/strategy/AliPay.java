package dp.strategy;

/**
 * 描述这个文件的用途
 *
 * @author WStars
 * @date 2022/2/16 11:08
 */
public class AliPay implements IPayStrategy {

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
