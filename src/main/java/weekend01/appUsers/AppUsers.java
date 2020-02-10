package weekend01.appUsers;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppUsers {

    public static void main(String[] args) throws FileNotFoundException {

        UsersCollection usersCollection = new UsersCollection();

        // int choiceMain = 0;
        int choiceMain;
        while ((choiceMain = Menu.mainMenu()) != 4) {

            switch (choiceMain) {
                case 1:
                    usersCollection.printAllUsers();
                    int choiceUser = Menu.choseUserToPrint(usersCollection.userNumber);
                    if (choiceUser != 0) {
                        usersCollection.printExtendedUser(choiceUser);
                        continue;
                    }
                    continue;


                case 2:
                    usersCollection.addUser(new User(usersCollection.userNumber + 1, getUserFirstName(), userLastName(), userSex()));
                    usersCollection.printAllUsers(); // todo maybe sould print ony one user?
                    System.out.println("Poprawnie wprowadzono dane obowiązkowe. Czy chcesz wprowadzić dane opcjonalne?");

                    if (Menu.choseYesNo()) {
                        if (Menu.wouldAddHeight() == 1) {
                                usersCollection.addHeightToUser(usersCollection.users[usersCollection.userNumber - 1], Menu.howHigh());
                        }
                        if (Menu.wouldAddDateOfBirth() == 1) {
                           usersCollection.addDateOfBirthToUser(usersCollection.users[usersCollection.userNumber - 1], Menu.addDateOfBirth());
                        }

                    }
                    continue;

                case 3:
                    System.out.println("Funkcja nie zaimplementowana");
                    continue;
                case 4:
                    System.out.println("#################    KONIEC PROGRAMU    #################");
                    continue;
                case 5:
                    usersCollection.addUsersFromFile();
                    continue;
                case 6:
                    usersCollection.WriteUsersToFile();
            }
        }
    }

    public static String getUserFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie użytkownika: ");
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

    public static User.sex userSex() {
        if (sex() == 1) {
            return User.sex.FEMALE;
        } else {
            return User.sex.MALE;
        }
    }

}
