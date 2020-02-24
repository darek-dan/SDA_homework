package recursion;

public class ReverseTable {

    public int[] reverseTable(int[] table) {
        int tableLength = table.length;
        // System.out.println(tableLength);
        int[] newTable = new int[tableLength];
        // System.out.println(Arrays.toString(newTable));
        return reversedCopyTable(tableLength - 1, 0, table, newTable);
    }

    public int[] reversedCopyTable(int tableLength, int tablePoz, int[] table, int[] newTable) {
        if (tablePoz == tableLength) {
            newTable[0] = table[tableLength];
            return newTable;
        } else {
            newTable[tableLength - tablePoz] = table[tablePoz];
            return reversedCopyTable(tableLength, tablePoz + 1, table, newTable);
        }
    }
}
