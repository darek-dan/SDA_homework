package weekend01;

public class CheckerboardArray {

    public static void main(String[] args) {

        String[][] checkerboard = new String[9][8];

        String sign = "X";
        String firstSign;
        // loop for filing array with X & O `s
        for (int i = 0; i < checkerboard.length; i++) {
            firstSign = sign;
            for (int j = 0; j < checkerboard[i].length; j++) {
                checkerboard[i][j] = sign;
                sign = changeSign(sign);
            }
            // condition to avoid bad print
            if (firstSign.equals("X")) {
                sign = "O";
            } else {
                sign = "X";
            }
        }
        // loop for printing array
        for (int i = 0; i < checkerboard.length; i++) {
            for (int j = 0; j < checkerboard[i].length; j++) {
                System.out.print(checkerboard[i][j]);
            }
            System.out.println();
        }
    }

    // method for changing sign
    public static String changeSign(String x) {
        String sign = x;
        if (sign.equals("X")) {
            sign = "O";
        } else {
            sign = "X";
        }
        return sign;
    }
}
