package recursion;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {

        int[] table = {10, 15, 18, 1, 6, 88, 56, 100, 500, 11, 68};
        System.out.println("Oryginalna tablica : " + Arrays.toString(table));
        System.out.println("Odwrócona tablica  : " + Arrays.toString(reverseTable(table)));
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
}
