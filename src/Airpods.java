final public class Airpods extends Iphone {
    private int price;
    private enum color{
        WHITE,BLACK,BROWN,PINK
    }


    public int getPrice() {
        return price;
    }

    public Airpods(String name, String mark, int price) {
        super(name, mark);
        this.price = price;
    }

    @Override
    public String getInfo() {
        super.getInfo();
        return color.BLACK + " " + getPrice() + " "+ getName();
    }
}
