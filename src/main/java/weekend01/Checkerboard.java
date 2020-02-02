package weekend01;

public class Checkerboard {

    public static void main(String[] args) {

        Draw(10);

    }

    static void Draw(int n) {
        int lines = n;
        int nStart = n;
        char sign = '*';
        for (int i = 0; i < lines; i++) {
            n = nStart;
            while (n > 0) {
                System.out.print(sign);
                if (sign == '*') {
                    sign = '#';
                } else {
                    sign = '*';
                }
                --n;
            }
            System.out.println();
            --lines;
        }
    }
}
