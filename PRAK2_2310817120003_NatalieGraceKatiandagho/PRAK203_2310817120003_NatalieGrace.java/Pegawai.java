public class Pegawai {
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
/*
Kode yang salah:
public class Employee { //harusnya Pegawai sesuai nama file
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
*/
