package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static class Mahasiswa {
        private String nama, nim;

        public Mahasiswa(String nama, String nim) {
            this.nama = nama;
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public String getNim() {
            return nim;
        }
    }

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = inputan.nextInt();

            if (pilihan == 0) {
                daftarMahasiswa.clear();
                System.out.println("Terima kasih!");
                break;
            } else if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                inputan.nextLine();
                String nama = inputan.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = inputan.nextLine();

                boolean nimSudahAda = false;
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNim().equals(nim)) {
                        nimSudahAda = true;
                        break;
                    }
                }

                if (nimSudahAda) {
                    System.out.println("NIM sudah ada, mohon masukkan NIM yang unik!");
                } else {
                    daftarMahasiswa.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
                String nim = inputan.next();

                boolean mahasiswaDitemukan = false;
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNim().equals(nim)) {
                        mahasiswaDitemukan = true;
                        daftarMahasiswa.remove(mahasiswa);
                        System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                        break;
                    }
                }

                if (!mahasiswaDitemukan) {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                String nim = inputan.next();

                boolean mahasiswaDitemukan = false;
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNim().equals(nim)) {
                        mahasiswaDitemukan = true;
                        System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                        break;
                    }
                }

                if (!mahasiswaDitemukan) {
                    System.out.println("NIM tidak ditemukan.");
                }
            } else if (pilihan == 4) {
                if (daftarMahasiswa.isEmpty()) {
                    System.out.println("Tidak ada data mahasiswa.");
                } else {
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
                    }
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        inputan.close();
    }
}
