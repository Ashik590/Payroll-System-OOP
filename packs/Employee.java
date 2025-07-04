
package packs;

abstract public class Employee {
    private String firstName;
    private String lastName;
    private long socialSecurityNumber;

    public Employee(String firstName, String lastName, long socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double earnings();

    public String toString() {
        String description = "First Name : " + firstName + "\nLastName : " + lastName + "\nSocial Security Number : "
                + socialSecurityNumber;

        return description;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}