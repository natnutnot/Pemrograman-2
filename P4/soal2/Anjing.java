package soal2;

import soal1.HewanPeliharaan;

public class Anjing extends HewanPeliharaan {
    private String warna;
    private String[] kemampuan;

    public Anjing(String nama, String ras, String warna, String[] kemampuan) {
        super(nama, ras);
        this.warna = warna;
        this.kemampuan = kemampuan;
    }

    public void displayAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu: " + warna);
        System.out.print("Memiliki kemampuan: ");
        for (int i = 0; i < kemampuan.length; i++) {
            System.out.print(kemampuan[i]);
            if (i < kemampuan.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
