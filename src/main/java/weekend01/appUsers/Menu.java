package weekend01.appUsers;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public static int mainMenu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "*********************   MENU GŁÓWNE   *********************\n\n" +
                "Co chcesz zrobić ? \n\n" +
                "1. Wyświtl listę wszystkich użytkowników \n" +
                "2. Dodaj nowego użytkownika \n" +
                "3. Edytuj użytkownika \n" +
                "4. Zakończ działanie \n" +
                "5. Wczytaj Użytkowników z pliku \n" +
                "6. Zapisz wszystkich Użytkowników do pliku \n\n" +
                "Wpisz odpowiednią cyfrę i naciśnij enter");
        switch (scanner.nextInt()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                System.out.println("Niewłaściwy wybór! Spróbuj jeszcze raz");
                System.out.println();
                return 1111;
        }
    }

    public static int choseUser(int usersTotal) {
        System.out.println("*********************   UŻYTKOWNICY   *********************\n");
        AppUsers.printListOfUsers(AppUsers.usersCollection);
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Powyżej dane podstawowe wszystkich użytkowników");
        System.out.println();
        System.out.println("Jeśli chcesz wyświetlić dodatkowe informację o użytkowniku wybierz jego numer i naciśnij enter");
        System.out.println("Jeśli nie wpisz 0 i wciśnij enter");
        while (true) {
            int choice = scanner.nextInt();
            if (choice > usersTotal || choice < 0) {
                System.out.println("Niewłaściwy wybór! Spróbuj jeszcze raz     (aby wyjść wybierz \"0\")");
                System.out.println();

            } else {
                return choice;
            }
        }

    }

    public static boolean choseYesNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz T/N");
        while (true) {
            String choice = scanner.next().toUpperCase();
            if (choice.equals("T")) {
                return true;
            }
            if (choice.equals("N")) {
                return false;
            } else {
                System.out.println("Nieprawidłowy wybór! wybierz \"T\" lub \"N\"");
            }
        }
    }


    public static int wouldAdd(String what) {

        System.out.println("Czy chcesz wprowadzić " + what);

        if (choseYesNo()) {
            return 1;
        } else {
            return 0;
        }
    }


    public static int addHeight() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz wzrost w centymetrach, np. \"185\"");
        int howHigh = scanner.nextInt();
        if (howHigh > 220) {
            System.out.println("Chyba przesadziłeś ;) wpisz jeszcze raz");
            addHeight();
        }
        if (howHigh < 10) {
            System.out.println("Widziałem karła ale to jest przegięcie lol - wpisz jeszcze raz");
        } else {
            return howHigh;
        }
        return 1111;
    }

    public static LocalDate addDateOfBirth() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź datę urodzenia w formacie rrrr-mm-dd, np. 1986-10-18");
        String scannedDate = scanner.next();
        return LocalDate.parse(scannedDate);
    }

    public static String[] addInterests() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wszystkie zainteresowania oddzielone przecinkami BEZ SPACJI!, np. pływanie,bieganie,jazda rowrem,taniec nowoczesny");
        return scanner.next().split(",");
    }
}
