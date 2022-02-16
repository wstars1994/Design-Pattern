package dp.prototype;

/**
 * 描述这个文件的用途
 *
 * @author WStars
 * @date 2022/2/16 11:15
 */
public class Product implements Cloneable{

    private String name;

    private String size;

    Product() {
        this.name = "asdasdasdasdasdasd：".substring(0,10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name += name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
