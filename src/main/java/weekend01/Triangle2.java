package weekend01;

import java.util.Scanner;

public class Triangle2 {

    public static void main(String[] args) {

        int linesToPrint;
        int starsToPrint = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę całkowitą z zakresu od 2 do 100");
            linesToPrint = scanner.nextInt();
            if (linesToPrint < 2 || linesToPrint > 100) {
                System.out.println("Podałeś liczbę która nie mieści się w zakresie");
            }
        } while (linesToPrint < 2 || linesToPrint > 100);


        while (linesToPrint > 0) {

            for (int i = 0; i < starsToPrint; i++) {
                System.out.print('*');
            }

            System.out.println();
            --linesToPrint;
            starsToPrint++;
        }

    }
}
