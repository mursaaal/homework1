public class Iphone extends Apple {
    private String mark;

    public Iphone(String name,String mark) {
        super(name);
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public String getInfo(){
       return getName() + " " + getMark();
    }

     public final String infoMark(){
        return getMark();
    }
}
