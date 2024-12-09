package soal1;

import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
    }

    public void tampilkanDetail() {
        display();
    }

    public static HewanPeliharaan inputData(Scanner in) {
        System.out.print("Nama: ");
        String nama = in.nextLine();
        System.out.print("Ras: ");
        String ras = in.nextLine();
        return new HewanPeliharaan(nama, ras);
    }
}
