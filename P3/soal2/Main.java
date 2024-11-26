package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static class Negara {
        private String nama;
        private String jenis;
        private String namaPemerintahan;
        private int tanggal;
        private int bulan;
        private int tahun;

        public Negara(String nama, String jenis, String namaPemerintahan, int tanggal, int bulan, int tahun) {
            this.nama = nama;
            this.jenis = jenis;
            this.namaPemerintahan = namaPemerintahan;
            this.tanggal = tanggal;
            this.bulan = bulan;
            this.tahun = tahun;
        }

        public int getBulan() {
            return bulan;
        }

        public void getData(Scanner inputan) {
            nama = inputan.nextLine(); 
            jenis = inputan.nextLine(); 
            namaPemerintahan = inputan.nextLine(); 

            if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
                tanggal = inputan.nextInt();
                bulan = inputan.nextInt();
                tahun = inputan.nextInt();
                inputan.nextLine();  
            }
        }

        public void tampil() {
            HashMap<Integer, String> month = new HashMap<>();
            month.put(1, "Januari");
            month.put(2, "Februari");
            month.put(3, "Maret");
            month.put(4, "April");
            month.put(5, "Mei");
            month.put(6, "Juni");
            month.put(7, "Juli");
            month.put(8, "Agustus");
            month.put(9, "September");
            month.put(10, "Oktober");
            month.put(11, "November");
            month.put(12, "Desember");

            if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
                System.out.println("Negara " + nama + " mempunyai " + jenis + " bernama " + namaPemerintahan);
            } else if (jenis.equalsIgnoreCase("monarki")) {
                System.out.println("Negara " + nama + " mempunyai Raja bernama " + namaPemerintahan);
            }

            if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggal + " " + month.get(getBulan()) + " " + tahun + "\n");
            }
        }
    }

    public static void main(String[] args) {
        String nama = "", jenis = "", namaPemerintahan = "";
        int tanggal = 0, bulan = 0, tahun = 0;

        Scanner input = new Scanner(System.in);
        LinkedList<Negara> listNegara = new LinkedList<>();

        System.out.print("Masukkan jumlah negara: ");
        int ulang = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < ulang; i++) {
            Negara c = new Negara(nama, jenis, namaPemerintahan, tanggal, bulan, tahun);
            c.getData(input); 
            listNegara.add(c);
        }

        for (Negara negara : listNegara) {
            negara.tampil();
        }

        input.close();
    }
}
