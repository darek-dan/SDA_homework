package weekend01;

public class Ranges {

    // declaration of variables
    private static int intMin;
    private static int intMax;
    private static long longMin;
    private static long longMax;
    private static short shortMin;
    private static short shortMax;
    private static float floatMin;
    private static float floatMax;
    private static double doubleMin;
    private static double doubleMax;
    // i don`t know why i should use "private static ..." when i try to declare global variable
    // but intelliJ tells me that so i done that:)

    public static void main(String[] args) {
        // set variables to their max and min values
        setVar();

        // lines printed for better readability
        System.out.println("   ");
        System.out.println("   ");

        // print values of min and max variables
        System.out.println("Minimalna wartość zmiennej typu : ");
        printMinVar();
        System.out.println("   ");
        System.out.println("Maksymalna wartość zmiennej typu : ");
        printMaxVar();
        System.out.println("   ");

        // modify values by add 1 to max and subtract 1 form min
        modVar();

        // print values of modified variables
        System.out.println("Wartość po odjęciu 1 od minimalnej wartości zmiennej typu : ");
        printMinVar();
        System.out.println("   ");
        System.out.println("Wartość po dodaniu 1 do maksymalnej wartości zmiennej typu : ");
        printMaxVar();
        System.out.println("   ");

    }

    // method for all variables set to their max and min
    static void setVar(){

        intMin = Integer.MIN_VALUE;
        intMax = Integer.MAX_VALUE;
        longMin = Long.MIN_VALUE;
        longMax = Long.MAX_VALUE;
        shortMin = Short.MIN_VALUE;
        shortMax = Short.MAX_VALUE;
        floatMin = Float.MIN_VALUE;
        floatMax = Float.MAX_VALUE;
        doubleMin = Double.MIN_VALUE;
        doubleMax = Double.MAX_VALUE;

    }

    // method for printing min values
    static void printMinVar(){

        System.out.println("int to : " + intMin);
        System.out.println("long to : " + longMin);
        System.out.println("short to : " + shortMin);
        System.out.println("float to : " + floatMin);
        System.out.println("double to : " + doubleMin);

    }

    // method for printing max values
    static void printMaxVar(){

        System.out.println("int to : " + intMax);
        System.out.println("long to : " + longMax);
        System.out.println("short to : " + shortMax);
        System.out.println("float to : " + floatMax);
        System.out.println("double to : " + doubleMax);
    }

    // method for modifying variables up and down :)      down and up in fact! :D
    static void modVar(){

        --intMin;
        intMax++;
        --longMin;
        longMax++;
        --shortMin;
        shortMax++;
        --floatMin;
        floatMax++;
        --doubleMin;
        doubleMax++;
    }

}

// Working of program shows us that if we subtract 1 from minimal value of specific simple variable
// that variable will take maximum value for that specific type of simple variable
// and if we add 1 to a maximum value of a specific variable that variable will take minimum value.
// BUT THIS IS ONLY FOR int long AND short FOR float AND double RESULT IS WEIRD :o
// How simple is that :/ ;)
