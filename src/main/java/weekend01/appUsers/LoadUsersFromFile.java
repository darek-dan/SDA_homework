package weekend01.appUsers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadUsersFromFile {
    private User[] newUsers = new User[100];

    public LoadUsersFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\darek\\OneDrive\\Java\\SDA_homework\\src\\main" +
                "\\java\\weekend01\\appUsers\\Users.txt"));
        while (scanner.hasNext("end;")) {


        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\darek\\OneDrive\\Java\\SDA_homework\\src\\main\\java\\weekend01\\appUsers\\Users.txt"));
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.nextLine());

    }
}
