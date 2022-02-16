package dp.strategy;

/**
 * 策略模式
 * 整体替换算法的实现部分，插件式
 *
 * @author WStars
 * @date 2022/2/16 10:53
 */
public class StrategyTest {

    public static void main(String[] args) {
        AliPay aliPay = new AliPay();
        WeChatPay weChatPay = new WeChatPay();
        BuyClient buyClient = new BuyClient();
        buyClient.setPayStrategy(aliPay);
        buyClient.toPay();

        buyClient.setPayStrategy(weChatPay);
        buyClient.toPay();
    }

}
