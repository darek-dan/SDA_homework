package recursion;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {

        System.out.println("\nZadanie pierwsze\n");
        int[] table = {10, 15, 18, 1, 6, 88, 56, 100, 500, 11, 68, 66, 555, -100};
        ReverseTable reversedTable = new ReverseTable();
        int[] revTable = reversedTable.reverseTable(table);
        System.out.println("Oryginalna tablica : " + Arrays.toString(table));
        System.out.println("Odwrócona tablica  : " + Arrays.toString(revTable) +

                "\n\nZadanie drugie\n");

        Arrays.sort(table);
        System.out.println("Posortowana tablica: " + Arrays.toString(table));
        int x = -100;
        int xPos = findPos(x, table) + 1;
        if (xPos != 0) {
            System.out.println("Liczba " + x + " znajduje się na " + xPos + " pozycji w tablicy");
        } else {
            System.out.println("Liczby " + x + " nie znaleziono w tablicy");
        }

        System.out.println("\n\nZadanie trzecie\n");
        DecToBin number = new DecToBin();
        number.transformToBin(155);
        System.out.println();
        number.transformToBin(1555);
        System.out.println();
        number.transformToBin(15557);
        System.out.println();
        number.transformToBinRec(15557);

        System.out.println("\n\nZadanie czwarte\n");
        IsPalindrome text = new IsPalindrome();
        text.isPalindrome("kobyła ma mały bok");
        text.isPalindrome("jeż leje lwa, paw leje lżej");
        text.isPalindrome("leci bażant na żabi cel");
        text.isPalindrome("kobyła ma maały bok");


    }


    public static int findPos(int number, int[] table) {

        int leftIndex = 0;
        int rightIndex = table.length - 1;

        if (number > table[rightIndex] || number < table[leftIndex]) {
            return -1;
        }
        if (number == table[rightIndex]) {
            return rightIndex;
        }
        return findPosRec(number, leftIndex, rightIndex, table);
    }

    public static int findPosRec(int number, int leftIndex, int rightIndex, int[] table) {

        if (leftIndex == rightIndex) {
            return -1;
        }

        int middleIndex = (rightIndex + leftIndex) / 2;

        if (table[middleIndex] == number) {
            return middleIndex;
        } else {
            if (table[middleIndex] > number) {
                return findPosRec(number, leftIndex, middleIndex, table);
            } else {
                return findPosRec(number, middleIndex + 1, rightIndex, table);
            }
        }
    }
}
