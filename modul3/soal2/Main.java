import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> listNegara = new LinkedList<>();

        System.out.print("Masukkan jumlah negara: ");
        int jumlahNegara = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlahNegara; i++) {
            Negara negara = new Negara("", "", "", 0, 0, 0);
            negara.getData(input); 
            listNegara.add(negara);
        }

        for (Negara negara : listNegara) {
            negara.tampil();
        }

        input.close();
    }
}
