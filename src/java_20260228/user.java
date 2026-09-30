package java_20260228;

public class user {
    private String name;
    private String password;
    private String PasswordCheck;
    private String email;
    private char gender;
    private int age;

    public user() {

    }

    public user(String name, String password, String PasswordCheck, String email, char gender, int age) {
        this.name = name;
        this.password = password;
        this.PasswordCheck = PasswordCheck;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
}
