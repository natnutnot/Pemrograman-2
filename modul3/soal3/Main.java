import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 0 -> {
                    daftarMahasiswa.clear();
                    System.out.println("Terima kasih!");
                    input.close();
                    return;
                }
                case 1 -> {
                    input.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    boolean nimExists = daftarMahasiswa.stream().anyMatch(m -> m.getNim().equals(nim));
                    if (nimExists) {
                        System.out.println("NIM sudah ada, mohon masukkan NIM yang unik!");
                    } else {
                        daftarMahasiswa.add(new Mahasiswa(nama, nim));
                        System.out.println("Mahasiswa berhasil ditambahkan!");
                    }
                }
                case 2 -> {
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
                    String nim = input.next();

                    boolean removed = daftarMahasiswa.removeIf(m -> m.getNim().equals(nim));
                    if (removed) {
                        System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                    }
                }
                case 3 -> {
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    String nim = input.next();

                    daftarMahasiswa.stream()
                            .filter(m -> m.getNim().equals(nim))
                            .findFirst()
                            .ifPresentOrElse(
                                    m -> System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama()),
                                    () -> System.out.println("NIM tidak ditemukan.")
                            );
                }
                case 4 -> {
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Tidak ada data mahasiswa.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        daftarMahasiswa.forEach(m -> System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama()));
                    }
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
