import java.util.Scanner;

public class PRAK102_2310817120003_NatalieGraceKatiandagho {
    
    public static void tampilkanDeret(int angkaAwal) {
        int count = 0;
        int angka = angkaAwal;

        while (count < 11) {
            if (angka % 5 == 0) { 
                System.out.print((angka / 5 - 1)); 
            } else {
                System.out.print(angka);
            }

            if (count < 10) {
                System.out.print(", "); 
            }
            
            angka++; 
            count++; 
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angkaAwal = scanner.nextInt();

        tampilkanDeret(angkaAwal);

        scanner.close();
    }
}
