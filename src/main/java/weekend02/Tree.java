package weekend02;

import java.util.Scanner;

public class Tree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base;
        do {
            System.out.println("Podaj wysokość choinki w zakresie od 2 do 100");
            base = scanner.nextInt();
            if (base < 2 || base > 100) {
                System.out.println("Podałeś liczbę która nie mieści się w zakresie");
            }
        } while (base < 2 || base > 100);

        int numberOfStars = 1;
        int numberOfSpaces;
        int numberOfLines;

        numberOfLines = base;


        while (numberOfLines > 0) {
            numberOfSpaces = numberOfLines -1;
            while (numberOfSpaces > 0) {
                System.out.print(" ");
                numberOfSpaces --;
            }

            int i;
            i = numberOfStars;
            while (i > 0) {
                System.out.print("*");
                --i;
            }

            numberOfStars += 2;
            -- numberOfLines;
            System.out.println();
        }

        numberOfSpaces = base - 2;
        while (numberOfSpaces > 0) {
            System.out.print(" ");
            -- numberOfSpaces;
        }

        System.out.println("| |");
    }


}


/*
     *
    ***
   *****
  *******
 *********
    | |
 */