package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HewanPeliharaan hewanP = HewanPeliharaan.inputData(in);
        hewanP.tampilkanDetail();
        in.close();
    }
}
