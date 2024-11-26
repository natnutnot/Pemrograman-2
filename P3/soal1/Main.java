package soal1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static class Dadu {
        private int nilai;

        public Dadu() {
            acakNilai();
        }

        public void acakNilai() {
            Random random = new Random();
            this.nilai = random.nextInt(6) + 1;
        }

        public int getNilai() {
            return nilai;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();

        if (jumlahDadu <= 0) {
            System.out.println("Jumlah dadu harus lebih dari 0!");
        }

        LinkedList<Dadu> daftarDadu = new LinkedList<>();
        int totalNilai = 0;

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);

            int nilaiDadu = dadu.getNilai();
            System.out.println("Dadu ke-" + i + " bernilai " + nilaiDadu);
            totalNilai += nilaiDadu;
        }

        System.out.println("Total nilai semua dadu: " + totalNilai);
        scanner.close();
    }
}
