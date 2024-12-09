package soal2;

import soal1.HewanPeliharaan;

public class Kucing extends HewanPeliharaan {
    private String warna;

    public Kucing(String nama, String ras, String warna) {
        super(nama, ras);
        this.warna = warna;
    }

    public void displayKucing() {
        super.display();
        System.out.println("Memiliki warna bulu: " + warna);
    }
}
