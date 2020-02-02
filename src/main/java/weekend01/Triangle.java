package weekend01;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int starsCounter;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę całkowitą z zakresu od 2 do 100");
            starsCounter = scanner.nextInt();
            if (starsCounter < 2 || starsCounter > 100) {
                System.out.println("Podałeś liczbę która nie mieści się w zakresie");
            }
        } while (starsCounter < 2 || starsCounter > 100);

        while (starsCounter > 0) {

            for (int i = 0; i < starsCounter; i++) {
                System.out.print('*');
            }

            System.out.println();
            --starsCounter;
        }
    }
}
