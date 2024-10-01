import java.util.Scanner;

public class PRAK104_2310817120003_NatalieGraceKatiandagho {

    public static String tentukanPemenang(String[] tanganAbu, String[] tanganBagas) {
        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            String abu = tanganAbu[i];
            String bagas = tanganBagas[i];

            if (abu.equals(bagas)) {
                continue;
            } else if ((abu.equals("B") && bagas.equals("G")) || 
                       (abu.equals("G") && bagas.equals("K")) || 
                       (abu.equals("K") && bagas.equals("B"))) { 
                poinAbu++; 
            } else {
                poinBagas++; 
            }
        }

        if (poinAbu == poinBagas) {
            return "Seri";
        } else if (poinBagas > poinAbu) {
            return "Bagas";
        } else {
            return "Abu";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String tanganAbuInput = scanner.nextLine();
        String[] tanganAbu = tanganAbuInput.split(" "); 

        System.out.print("Tangan Bagas: ");
        String tanganBagasInput = scanner.nextLine();
        String[] tanganBagas = tanganBagasInput.split(" "); 

        String pemenang = tentukanPemenang(tanganAbu, tanganBagas);

        System.out.println(pemenang);

        scanner.close();
    }
}
