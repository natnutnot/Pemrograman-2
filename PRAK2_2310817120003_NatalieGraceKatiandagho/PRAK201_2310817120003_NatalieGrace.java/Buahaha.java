public class Buahaha {
    String namaBuahaha;
    double beratBuahaha;
    double hargaPerKiloHaha;
    double totalBeliHaha;

    public Buahaha(String nama, double berat, double hargaPerKilo, double totalBeli) {
        this.namaBuahaha = nama;
        this.beratBuahaha = berat;
        this.hargaPerKiloHaha = hargaPerKilo;
        this.totalBeliHaha = totalBeli;
    }

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
        return "Nama Buah: " + namaBuahaha +
               "\nBerat: " + beratBuahaha +
               "\nHarga: " + hargaPerKiloHaha +
               "\nJumlah Beli: " + totalBeliHaha + "kg" +
               "\nHarga Sebelum Diskon: Rp" + String.format("%.2f", hitungHargaSebelumPotongHaha()) +
               "\nTotal Diskon: Rp" + String.format("%.2f", hitungTotalPotongHaha()) +
               "\nHarga Setelah Diskon: Rp" + String.format("%.2f", hitungHargaSetelahPotongHaha()) + "\n";
    }
}
