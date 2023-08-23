package homework2.ex1;

public class Employee {

    private final String  fullName;
    private String jobTitle;
    private String email;
    private String telNumber;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String telNumber, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telNumber = telNumber;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public int getAge() {
        return age;
    }
}
