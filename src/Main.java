public class Main {

    public static void main(String[] args) {
        Iphone i = new Iphone("Iphone","iphone 7");
        Airpods a = new Airpods("Iphone" , "airpods pro",300);
        Airpods a1 = new Airpods("Iphone","airpoods",3000);

        System.out.println(a.getInfo());
        System.out.println(a1.getInfo());
        System.out.println(i.getInfo());
        System.out.println(i.infoMark());
    }
}
