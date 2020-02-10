package weekend01.appUsers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsersCollection {

    final LocalDate dateDefault = LocalDate.parse("1000-01-01");
    private static String userSex;
    User[] users = new User[100];
    int userNumber = 0;
    int actualUserNumber;
    private User.sex sex;

    void addUser(User... users) {
        for (User newUser : users) {
            this.users[userNumber] = newUser;
            userNumber++;
        }
    }

    void addUsersFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\darek\\OneDrive\\Java\\SDA_homework\\src\\main" +
                "\\java\\weekend01\\appUsers\\Users.txt"));
        while (scanner.hasNext()) {
            scanner.findInLine("firstName=");
            String userFirstName = scanner.next();

            scanner.findInLine("lastName=");
            String userLastName = scanner.next();

            scanner.findInLine("sex=");
            userSex = scanner.next();

            scanner.findInLine("height=");
            int userHeight = scanner.nextInt();

            scanner.findInLine("birthDate=");
            String birthDate = scanner.next();
            LocalDate dateOfBirthParsed = LocalDate.parse(birthDate);

            // String[] interests = scanner.nextLine().split(",");
            Pattern interestsPattern = Pattern.compile("\".+\".+");
            Matcher interestsMatched = interestsPattern.matcher(scanner.nextLine());
            // System.out.println(interestsMatched);
            String[] tempInterests = new String[100];
            int numberOfInterests = 0;
            while (interestsMatched.find()) {
                tempInterests[numberOfInterests] = interestsMatched.group();
                numberOfInterests++;
            }
            String[] interests = new String[numberOfInterests];

            for (int i = 0; i < numberOfInterests; i++) {
                interests[i] = tempInterests[i];
                i++;
                // System.out.println(Arrays.toString(tempInterests));
            }
            // scanner.nextLine();
            System.out.println("Dodano: " + userFirstName + " " + userLastName);
            addUser(new User(userNumber + 1, userFirstName, userLastName, userSex(), userHeight, dateOfBirthParsed, interests));
            // scanner.findInLine("end;");
        }
    }

    void WriteUsersToFile() throws FileNotFoundException {
        StringBuilder file = new StringBuilder();
        for (int i = 0; i < userNumber; i++) {
            actualUserNumber = i + 1;
            file.append(BuildLineToSave(users[i]));
        }
        // System.out.println(file);
        PrintWriter saveToFile = new PrintWriter("C:\\Users\\darek\\OneDrive\\Java\\SDA_homework\\src\\main" +
                "\\java\\weekend01\\appUsers\\Users.txt");
        saveToFile.println(file);
        saveToFile.close();
        System.out.println("Zapisano Użytkowników w pliku :)");

    }

    String BuildLineToSave(User user) {
        String lineToSave = ("firstName= " + user.getFirstName() + " lastName= " + user.getLastName() +
                " sex= " + user.getSex() + " end;\r\n");
        return lineToSave;
    }

    void printAllUsers() {
        for (int i = 0; i < userNumber; i++) {
            printUser(users[i]);
        }
    }

    void printExtendedUser(int actualUserNumber) {
        printExtendedUser(users[actualUserNumber - 1]);
    }

    void printExtendedUser(User user) {
        String sex;
        if (user.getSex().equals(User.sex.MALE)) {
            sex = "Mężczyzna";
        } else {
            sex = "Kobieta";
        }
        System.out.println("Użytkownik " + user.getUserNumber() + " Imie: "
                + user.getFirstName() + " Nazwisko: " + user.getLastName() + " płeć: " + sex
                + " Data urodzenia: " + user.getBirthDate() + " zainteresowania: " + printInterests(user.getInterests()));

    }

    void printUser(User user) {
        System.out.println("Użytkownik " + user.getUserNumber() + " Imie: "
                + user.getFirstName() + " Nazwisko: " + user.getLastName());
    }

    String printInterests(String[] interests) {
        StringBuilder interestsString = new StringBuilder();
        for (String element : interests) {
            interestsString.append(element);
        }
        return interestsString.toString();
    }

    void addHeightToUser(User user, int height) {
        user.setHeight(height);
    }

    public static User.sex userSex() {
        if (userSex.equals("FEMALE")) {
            return User.sex.FEMALE;
        } else {
            return User.sex.MALE;
        }
    }

}
