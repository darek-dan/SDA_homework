package weekend01.appUsers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsersCollection {

    private static int userSex;
    User[] users = new User[100];
    int userNumber = 0;
    int actualUserNumber;
    int usersTotal = 0;
    private User.Sex sex;

    void addUser(User... users) {
        for (User newUser : users) {
            this.users[userNumber] = newUser;
            userNumber++;
            usersTotal++;
        }
    }

    public static User.Sex userSex() {
        if (userSex == 1) {
            return User.Sex.FEMALE;
        } else {
            return User.Sex.MALE;
        }
    }

    void LoadUsersFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\darek\\OneDrive\\Java\\SDA_homework\\src\\main" +
                "\\java\\weekend01\\appUsers\\Users.txt"));
        while (scanner.hasNext()) {
            scanner.findInLine("firstName=");
            String userFirstName = scanner.next();
            scanner.findInLine("lastName=");
            String userLastName = scanner.next();
            scanner.findInLine("sex=");
            userSex = scanner.nextInt();
            scanner.findInLine("end;");
            scanner.nextLine();
            System.out.println(userFirstName + " " + userLastName + " " + userSex());
            addUser(new User(userFirstName, userLastName, userSex()));
            // addUser(new User(scanner.findInLine("firstName="), scanner.findInLine("lastName="), scanner.next()));

        }
    }

    void printAllUsers() {
        // wypisz wszystkie elementy tablicy this.users od 0 do (this.userNumber -1)

        for (int i = 0; i < userNumber; i++) {
            actualUserNumber = i + 1;
            printUser(users[i]);
        }
    }

    void printExtendedUser(int actualUserNumber) {
        printExtendedUser(users[actualUserNumber]);
    }

    void printExtendedUser(User user) {
        System.out.println("Użytkownik " + actualUserNumber + " Imie: "
                + user.getFirstName() + " Nazwisko: " + user.getLastName() + "płeć: " + user.getSex());

    }

    void printUser(User user) {
        System.out.println("Użytkownik " + actualUserNumber + " Imie: "
                + user.getFirstName() + " Nazwisko: " + user.getLastName());
    }

    public void setActualUserNumber(int actualUserNumber) {
        this.actualUserNumber = actualUserNumber;
    }
}
