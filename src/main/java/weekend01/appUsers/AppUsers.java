package weekend01.appUsers;

import java.util.Scanner;

public class AppUsers {

    public static String userFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie użytkownika: ");
        return scanner.nextLine();
    }

    public static String userName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę użytkownika: ");
        return scanner.nextLine();
    }


    public static String userLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Nazwisko użytkownika: ");
        return scanner.nextLine();
    }

    public static int userHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wzrost użytkownika: ");
        return scanner.nextInt();
    }

    public static int sex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz płeć użytkownika   1 - Kobieta   2 - Mężczyzna");
        int sex;
        sex = scanner.nextInt();
        while (sex > 2 || sex < 0) {
            System.out.println("Wprowadzono niewłaściwą cyfrę! Wpisz  1  lub  2");
            System.out.println();
            System.out.println("1 to Kobieta       2 to Meżczyzna");
            sex = scanner.nextInt();
        }
        return sex;
    }

    public static User.Sex userSex() {
        if (sex() == 1) {
            return User.Sex.FEMALE;
        } else {
            return User.Sex.MALE;
        }
    }


    public static void main(String[] args) {
        UsersCollection usersCollection = new UsersCollection();
        int choice = 0;
        while (choice != 4) {
            choice = menu();
            int choseUser = 101;

            switch (choice) {
                case 1:
                    System.out.println("Oto dane podstawowe wszystkich użytkowników: ");
                    System.out.println();
                    usersCollection.printAllUsers();
                    System.out.println();
                    System.out.println("Jeśli chcesz wyświetlić dodatkowe informację o użytkowniku wybierz jego numer i naciśnij enter");
                    System.out.println("Jeśli nie wpisz 0 i wciśnij enter");


                    while (choseUser != 0) {
                        choseUser = choseUser();
                        if (choseUser == 0) {break;}
                        // System.out.println(usersCollection.usersTotal);
                        // System.out.println(choseUser);
                        if (usersCollection.usersTotal < choseUser) {
                            System.out.println("!!!!!!!!   TAKI UŻYTKOWNIK NIE ISTNIEJE   !!!!!!!!!");
                            break;
                        } else {
                            usersCollection.setActualUserNumber(choseUser);
                            usersCollection.printExtendedUser(choseUser - 1);
                        }

                    }
                    break;

                case 2:
                    usersCollection.addUser(new User(userFirstName(), userLastName(), userSex()));
                    usersCollection.printAllUsers();
                    continue;
                case 3:
                    System.out.println("Funkcja nie zaimplementowana");
                    continue;
                case 4:
                    System.out.println("#################    KONIEC PROGRAMU    #################");
                    continue;
            }
        }
    }

    public static int choseUser() {
        int choseUser;
        Scanner scanner = new Scanner(System.in);
        choseUser = scanner.nextInt();
        return choseUser;
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("*********************   MENU GŁÓWNE   *********************");
        System.out.println("");
        System.out.println("Co chcesz zrobić ? ");
        System.out.println("");
        System.out.println("1. Wyświtl listę wszystkich użytkowników");
        System.out.println("2. Dodaj nowego użytkownika");
        System.out.println("3. Edytuj użytkownika");
        System.out.println("4. Zakończ działanie");
        System.out.println("");
        System.out.println("Wybierz 1, 2 lub 3 i naciśnij enter");
        switch (scanner.nextInt()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                System.out.println("Niewłaściwy wybór! Spróbuj jeszcze raz");
                System.out.println();
                menu();
        }
        return scanner.nextInt();
        // System.out.println(choice);


    }

    void printClassName(Object obj) {
        System.out.println("The class of " + obj +
                " is " + obj.getClass().getName());
    }
}
