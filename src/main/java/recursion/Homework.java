package recursion;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {

        System.out.println("\nZadanie pierwsze\n");

        int[] table = {10, 15, 18, 1, 6, 88, 56, 100, 500, 11, 68, 66, 555, -100};
        System.out.println("Oryginalna tablica : " + Arrays.toString(table));
        System.out.println("Odwrócona tablica  : " + Arrays.toString(reverseTable(table)) +

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
    }

    public static int[] reverseTable(int[] table) {
        int tableLength = table.length;
        // System.out.println(tableLength);
        int[] newTable = new int[tableLength];
        // System.out.println(Arrays.toString(newTable));
        return reversedCopyTable(tableLength - 1, 0, table, newTable);
    }

    public static int[] reversedCopyTable(int tableLength, int tablePoz, int[] table, int[] newTable) {
        if (tablePoz == tableLength) {
            newTable[0] = table[tableLength];
            return newTable;
        } else {
            newTable[tableLength - tablePoz] = table[tablePoz];
            return reversedCopyTable(tableLength, tablePoz + 1, table, newTable);
        }
    }

    public static int findPos(int number, int[] table) {

        int leftIndex = 0;
        int rightIndex = table.length - 1;

        if (number > table[rightIndex] || number < table[leftIndex]) {
            return -1;
        }
        if (number == table[rightIndex]){
            return rightIndex;
        }
        return findPozRec(number, leftIndex, rightIndex, table);
    }

    public static int findPozRec(int number, int leftIndex, int rightIndex, int[] table) {

        if (leftIndex == rightIndex) {
            return -1;
        }

        int middleIndex = (rightIndex + leftIndex) / 2;

        if (table[middleIndex] == number) {
            return middleIndex;
        } else {
            if (table[middleIndex] > number) {
                return findPozRec(number, leftIndex, middleIndex, table);
            } else {
                return findPozRec(number, middleIndex + 1, rightIndex, table);
            }
        }
    }
}
