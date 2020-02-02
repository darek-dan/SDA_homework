package weekend01;

public class Checkerboard {

    public static void main(String[] args) {

        Draw(10);
        Draw(11);
        DrawWithFrame(10);
        DrawWithFrame(11);

    }

    static void Draw(int n) {
        int lines = n;
        int nStart = n;
        char sign = '*';
        char firstLineSign;

        for (int i = 0; i < lines; i++) {
            n = nStart;
            firstLineSign = sign;
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
            if (firstLineSign == '*') {
                sign = '#';
            } else {
                sign = '*';
            }
            --lines;
        }
    }

    static void DrawWithFrame(int n) {
        int lines = n;
        int nStart = n;
        char sign = '*';
        char firstLineSign;

        System.out.print('╔');
        for (int i = 0; i < n; i++) {
            System.out.print('═');
        }
        System.out.print('╗');
        System.out.println();

        n = nStart;

        for (int i = 0; i < lines; i++) {
            n = nStart;
            firstLineSign = sign;
            System.out.print('║');

            while (n > 0) {
                System.out.print(sign);
                if (sign == '*') {
                    sign = '#';
                } else {
                    sign = '*';
                }
                --n;
            }
            System.out.print('║');
            System.out.println();
            if (firstLineSign == '*') {
                sign = '#';
            } else {
                sign = '*';
            }
            --lines;
        }

        n = nStart;
        System.out.print('╚');

        for (int i = 0; i < n; i++) {
            System.out.print('═');
        }
        System.out.print('╝');
        System.out.println();
    }
}
