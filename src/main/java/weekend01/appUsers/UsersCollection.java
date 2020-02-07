package weekend01.appUsers;

public class UsersCollection {

    User[] users = new User[100];
    int userNumber = 0;
    int actualUserNumber;
    int usersTotal = 0;

    void addUser(User... users) {
        for (User newUser: users) {
            this.users[userNumber] = newUser;
            userNumber++;
            usersTotal++;
        }
    }

    void printAllUsers() {
        // wypisz wszystkie elementy tablicy this.users od 0 do (this.userNumber -1)

        for (int i = 0; i < userNumber; i++) {
            actualUserNumber = i + 1;
            printUser(users[i]);
        }
    }

    void printExtendedUser (int actualUserNumber) {
        printExtendedUser(users[actualUserNumber]);
    }

    void printExtendedUser(User user) {
        System.out.println("Użytkownik " + actualUserNumber + " Imie: " + user.getFirstName() + " Nazwisko: " + user.getLastName() + "płeć: " + user.getSex());

    }

    void printUser(User user) {
        System.out.println("Użytkownik " + actualUserNumber + " Imie: " + user.getFirstName() + " Nazwisko: " + user.getLastName());
    }

    public void setActualUserNumber(int actualUserNumber) {
        this.actualUserNumber = actualUserNumber;
    }
}
