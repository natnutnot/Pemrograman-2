package PRAK202_2310817120003_NatalieGraceKatiandagho;

public class buahaha {
    String namaBuahaha;
    double beratBuahaha;
    double hargaPerKiloHaha;
    double totalBeliHaha;

    double hitungHargaSebelumPotongHaha() {
        return totalBeliHaha / beratBuahaha * hargaPerKiloHaha;
    }

    double hitungTotalPotongHaha() {
        return (totalBeliHaha / 4) * (hargaPerKiloHaha * 4 * 0.02);
    }

    double hitungHargaSetelahPotongHaha() {
        return hitungHargaSebelumPotongHaha() - hitungTotalPotongHaha();
    }

    String infoBuahaha() {
        return "Nama Buahaha: " + namaBuahaha + "\nBerat Buahaha: " + beratBuahaha + "kg" +
               "\nHarga Per KiloHaha: Rp" + hargaPerKiloHaha + "\nTotal Beli Haha: " + totalBeliHaha + "kg" +
               "\nHarga Sebelum PotongHaha: Rp" + String.format("%.2f", hitungHargaSebelumPotongHaha()) +
               "\nTotal PotongHaha: Rp" + String.format("%.2f", hitungTotalPotongHaha()) +
               "\nHarga Setelah PotongHaha: Rp" + String.format("%.2f", hitungHargaSetelahPotongHaha()) + "\n";
    }

    public static void main(String[] args) {
        buahaha apelHaha = new buahaha();
        apelHaha.namaBuahaha = "Apel";
        apelHaha.hargaPerKiloHaha = 7000.0;
        apelHaha.beratBuahaha = 0.4;
        apelHaha.totalBeliHaha = 40.0;

        buahaha manggaHaha = new buahaha();
        manggaHaha.namaBuahaha = "Mangga";
        manggaHaha.hargaPerKiloHaha = 3500.0;
        manggaHaha.beratBuahaha = 0.2;
        manggaHaha.totalBeliHaha = 15.0;

        buahaha alpukatHaha = new buahaha();
        alpukatHaha.namaBuahaha = "Alpukat";
        alpukatHaha.hargaPerKiloHaha = 10000.0;
        alpukatHaha.beratBuahaha = 0.25;
        alpukatHaha.totalBeliHaha = 12.0;

        System.out.println(apelHaha.infoBuahaha());
        System.out.println(manggaHaha.infoBuahaha());
        System.out.println(alpukatHaha.infoBuahaha());
    }
}
