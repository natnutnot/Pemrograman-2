package PRAKTIKUM6;

public class Mahasiswa {
    private int id;
    private String namaLengkap;
    private String nomorInduk;

    public Mahasiswa(int id, String namaLengkap, String nomorInduk) {
        this.id = id;
        this.namaLengkap = namaLengkap;
        this.nomorInduk = nomorInduk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNomorInduk() {
        return nomorInduk;
    }

    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }
}
