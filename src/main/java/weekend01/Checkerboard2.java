package weekend01;

public class Checkerboard2 {

    public static void main(String[] args) {

    Draw(5);

    }

    static void Draw(int n) {
        int lines = n * 2;
        int nStart = n;
        boolean copyLine = false;
        String sign;
        String firstLineSign = "**";

        for (int i = 0; i < lines; i++) {
            n = nStart;
            sign = firstLineSign;
            while (n > 0) {
                System.out.print(sign);

                if (sign.equals("**")) {
                    sign = "##";
                } else {
                    sign = "**";
                }
                --n;

            }
            System.out.println();

            if (copyLine) {

                if (firstLineSign.equals("**")) {
                    firstLineSign = "##";
                } else {
                    firstLineSign = "**";
                }
                copyLine = false;
                --lines;

            } else {
                copyLine = true;
                lines++;
            }
        }
    }


}




