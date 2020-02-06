package weekend01.appUsers;

import java.util.Scanner;

public class User {

    private final String firstName;
    private final String lastName;
    public enum Sex {
        MALE,
        FEMALE,
    }
    private Sex sex;
    private int height;
    private String birthDate;
    private String[] interests;
    // static final int MIN_AGE = 18;
    public User(String firstName, String lastName, Sex sex) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;

    }

    public User(String firstName, String lastName, Sex sex, int height, String birthDate, String[] interests) {

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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    // boolean isAdult() {
    //     boolean isAdult = sex >= MIN_AGE;
    //    return isAdult;
    // }


}
