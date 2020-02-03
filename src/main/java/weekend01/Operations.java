package weekend01;

public class Operations {

    public static void main(String[] args) {

        int [] Array1 = {100, 50, 10, 1, 8, 9, 7, 6, 5};
        short [] Array2 = {100, 50, 10, 1, 8, 9, 7, 6, 5};
        long [] Array3 = {100, 50, 10, 1, 8, 9, 7, 6, 5};
        double [] Array4 = {100, 50, 10, 1, 8, 9, 7, 6, 5};
        float [] Array5 = {100, 50, 10, 1, 8, 9, 7, 6, 5};
        byte [] Array6 = {100, 50, 10, 1, 8, 9, 7, 6, 5};

        System.out.println(sum(Array1));
        System.out.println(sum(Array2));
        System.out.println(sum(Array3));
        System.out.println(sum(Array4));
        System.out.println(sum(Array5));
        System.out.println(sum(Array6));

    }

    public static int sum(int [] array) {

        int sum = 0;
        for (int element: array) {
            sum += element;
        }
        return sum;
    }

    public static short sum(short [] array) {

        short sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static long sum(long [] array) {

        long sum = 0;
        for (long element : array) {
            sum += element;
        }
        return sum;
    }

    public static double sum(double [] array) {

        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    public static byte sum(byte [] array) {

        byte sum = 0;
        for (byte element : array) {
            sum += element;
        }
        return sum;
    }

    public static float sum(float [] array) {

        float sum = 0;
        for (float element : array) {
            sum += element;
        }
        return sum;
    }

}
