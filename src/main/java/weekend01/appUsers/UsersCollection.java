package weekend01.appUsers;

public class UsersCollection {

    User[] users = new User[100];
    int userNumber = 0;
    int actualUserNumber;

    void addUser(User... users) {
        for (User newUser: users) {
            this.users[userNumber] = newUser;
            userNumber++;
        }
    }

    void printAllUsers() {
        // wypisz wszystkie elementy tablicy this.points od 0 do (this.pointNumber -1)

        for (int i = 0; i < userNumber; i++) {
            actualUserNumber = i + 1;
            printUser(users[i]);
        }
    }

    void printUser(User user) {
        System.out.println("Użytkownik " + actualUserNumber + " Imie: " + user.getFirstName() + " Nazwisko: " + user.getLastName());
    }




}
