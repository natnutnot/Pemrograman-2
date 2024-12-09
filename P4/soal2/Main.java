package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();  

        if (pilihan == 1) {
            inputKucing(input);
        } else if (pilihan == 2) {
            inputAnjing(input);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }

    private static void inputKucing(Scanner input) {
        System.out.print("Nama hewan peliharaan: ");
        String nama = input.nextLine();
        System.out.print("Ras: ");
        String ras = input.nextLine();
        System.out.print("Warna Bulu: ");
        String warna = input.nextLine();

        Kucing kucing = new Kucing(nama, ras, warna);
        kucing.displayKucing();  
    }

    private static void inputAnjing(Scanner input) {
        System.out.print("Nama hewan peliharaan: ");
        String nama = input.nextLine();
        System.out.print("Ras: ");
        String ras = input.nextLine();
        System.out.print("Warna Bulu: ");
        String warna = input.nextLine();
        System.out.print("Kemampuan : ");
        String kemampuanInput = input.nextLine();

        String[] kemampuan = kemampuanInput.split(",\\s*");

        Anjing anjing = new Anjing(nama, ras, warna, kemampuan);
        anjing.displayAnjing();  
    }
}
