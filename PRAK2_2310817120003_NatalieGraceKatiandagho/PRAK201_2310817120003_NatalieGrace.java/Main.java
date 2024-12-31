public class Main {
    public static void main(String[] args) {

        Buahaha apelHaha = new Buahaha("Apel", 0.4, 7000.0, 40.0);
        Buahaha manggaHaha = new Buahaha("Mangga", 0.2, 3500.0, 15.0);
        Buahaha alpukatHaha = new Buahaha("Alpukat", 0.25, 10000.0, 12.0);

        System.out.println(apelHaha.infoBuahaha());
        System.out.println(manggaHaha.infoBuahaha());
        System.out.println(alpukatHaha.infoBuahaha());
    }
}
