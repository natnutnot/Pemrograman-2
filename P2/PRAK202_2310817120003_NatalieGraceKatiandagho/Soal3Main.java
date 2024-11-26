package PRAK202_2310817120003_NatalieGraceKatiandagho;

public class Soal3Main {

    public static class Pegawai {
        public String nama;
        public String asal; // Mengubah char menjadi String
        public String jabatan;
        public int umur = 17; // Menambahkan inisialisasi umur

        public String getNama() {
            return nama;
        }

        public String getAsal() {
            return asal;
        }

        public void setJabatan(String j) { // Menambahkan parameter untuk jabatan
            this.jabatan = j;
        }
    }

    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

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
Kode yang salah:
package praktikum2.soal3;

public class Employee {
    public String nama;
    public char asal; // seharusnya String
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal; // seharusnya mengembalikan String
    }

    public void setJabatan() { // tidak memiliki parameter
        this.jabatan = j; // j tidak didefinisikan
    }
}

package praktikum2.soal3;

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
