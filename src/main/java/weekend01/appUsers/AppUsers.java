package weekend01.appUsers;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class AppUsers {

    static UsersCollection usersCollection = new UsersCollection();

    public static void main(String[] args) throws FileNotFoundException {

        // UsersCollection usersCollection = new UsersCollection();

        int choiceMain;
        while ((choiceMain = Menu.mainMenu()) != 4) {

            switch (choiceMain) {
                case 1:

                    // System.out.println("*********************   UŻYTKOWNICY   *********************");
                    // usersCollection.printAllUsers();
                    int choiceUser = Menu.choseUser(usersCollection.userNumber);

                    if (choiceUser != 0) {
                        usersCollection.printExtendedUser(choiceUser);
                    }
                    break;

                case 2:
                    usersCollection.addUser(new User(usersCollection.userNumber + 1, getUserFirstName(), userLastName(), userSex()));
                    usersCollection.printUser(usersCollection.users[usersCollection.userNumber - 1]);
                    System.out.println("Poprawnie wprowadzono dane obowiązkowe. Czy chcesz wprowadzić dane opcjonalne?");

                    if (Menu.choseYesNo()) {
                        if (Menu.wouldAdd("wzrost ?") == 1) {
                            usersCollection.addHeightToUser(usersCollection.users[usersCollection.userNumber - 1], Menu.addHeight());
                        } else {
                            usersCollection.addHeightToUser(usersCollection.users[usersCollection.userNumber - 1], 0);
                        }
                        if (Menu.wouldAdd("datę urodzenia ?") == 1) {
                            usersCollection.addDateOfBirthToUser(usersCollection.users[usersCollection.userNumber - 1], Menu.addDateOfBirth());
                        } else {
                            usersCollection.addDateOfBirthToUser(usersCollection.users[usersCollection.userNumber - 1], LocalDate.parse("1000-01-01"));
                        }
                        if (Menu.wouldAdd("zainteresowania ?") == 1) {
                            usersCollection.addInterestsToUser(usersCollection.users[usersCollection.userNumber - 1], Menu.addInterests());
                        } else {
                            usersCollection.addInterestsToUser(usersCollection.users[usersCollection.userNumber - 1], new String[]{"nie wpisano"});
                        }
                    } else {
                        usersCollection.addHeightToUser(usersCollection.users[usersCollection.userNumber - 1], 0);
                        usersCollection.addDateOfBirthToUser(usersCollection.users[usersCollection.userNumber - 1], LocalDate.parse("1000-01-01"));
                        usersCollection.addInterestsToUser(usersCollection.users[usersCollection.userNumber - 1], new String[]{"nie wpisano"});
                    }
                    break;

                case 3:
                    System.out.println("Funkcja nie zaimplementowana");
                    break;
                case 4:
                    break;
                case 5:
                    usersCollection.addUsersFromFile();
                    break;
                case 6:
                    usersCollection.WriteUsersToFile();
            }
        }

        System.out.println("#################    KONIEC PROGRAMU    #################");
    }

    public void printAllUsers (int userNumber) {

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

    static void printListOfUsers(UsersCollection users) {
        users.printAllUsers();
    }

}
