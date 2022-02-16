package dp.prototype;

/**
 * 原型模式
 * 通过复制批量生成实例，提高性能
 * @author WStars
 * @date 2022/2/16 11:12
 */
public class CloneTest {

    public static void main(String[] args) {
        long nanoTime = System.nanoTime();
        Product product = new Product();
        product.setSize("27吋");
        for (int i = 0; i < 10000; i++) {
            try {
                Product cloneProduct = (Product) product.clone();
                cloneProduct.setName(i+"");
                System.out.println(cloneProduct.getName());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

//            Product cloneProduct = new Product();
//            cloneProduct.setName(i+"");



        }
        long endNanoTime = System.nanoTime();

        System.out.println((endNanoTime-nanoTime)/1000);
    }

}
