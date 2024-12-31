public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai(); // Menggunakan Pegawai

        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel"; // Menambahkan titik koma yang hilang
        p1.setJabatan("Assasin");

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun"); // Menambahkan keterangan tahun
    }
}
/*
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai(); // harusnya Employee
        p1.nama = "Roi"; // Hilang titik koma
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur); // Umur defaultnya 0
    }
}
*/
