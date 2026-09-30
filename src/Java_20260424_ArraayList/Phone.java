package Java_20260424_ArraayList;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrise(int price) {
        this.price = price;
    }

    // 5. 重写toString，让打印能看到内容，而不是地址值
    @Override
    public String toString() {
        return "手机" +
                "品牌'" + brand + '\'' +
                ", 价格=" + price;
    }
}
