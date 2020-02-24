package recursion;

public class DecToBin {

    public void transformToBin (int base){
        while (base != 0){
            System.out.print(base % 2);
            base = base / 2;
        }
    }

    public void transformToBinRec (int base){
        if (base != 0){
            System.out.print(base % 2);
            transformToBinRec(base / 2);
        }
    }
}
