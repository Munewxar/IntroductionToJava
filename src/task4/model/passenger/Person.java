package task4.model.passenger;

/**
 * This class describes person (passenger).
 * @author      Steven Altamirano
 */
public class Person {
    private int age;
    private Sex sex;
    private String firstName;
    private String lastName;
    private boolean luggage;

    public enum Sex{
        MALE,
        FEMALE
    }

    public Person(int age, Sex sex, String firstName, String lastName, boolean luggage) {
        this.age = age;
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.luggage = luggage;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int haveLuggage() {
        return luggage ? 1 : 0;
    }
}
