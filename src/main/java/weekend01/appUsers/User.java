package weekend01.appUsers;

import java.time.LocalDate;

public class User {

    private int userNumber = 0;
    private final String firstName;
    private final String lastName;
    private User.sex sex;
    private int height;
    private LocalDate birthDate;
    private String[] interests;
    // static final int MIN_AGE = 18;
    enum sex {
        MALE,
        FEMALE,
    }

    public User(int userNumber, String firstName, String lastName, User.sex sex) {

        this.userNumber = userNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public User(int userNumber, String firstName, String lastName, User.sex sex, int height, LocalDate birthDate, String[] interests) {

        this.userNumber = userNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.height = height;
        this.birthDate = birthDate;
        this.interests = interests;
    }

    User(User other) {

        firstName = other.firstName;
        lastName = other.lastName;
        sex = other.sex;
    }

    void introduce() {

        System.out.println("Imie:      " + firstName);
        System.out.println("Nazwisko:  " + lastName);
        System.out.println("Płeć:      " + sex);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public User.sex getSex() {
        return sex;
    }

    public void setSex(User.sex sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public int getUserNumber() {
        return userNumber;
    }
    // boolean isAdult() {
    //     boolean isAdult = sex >= MIN_AGE;
    //    return isAdult;
    // }


}
