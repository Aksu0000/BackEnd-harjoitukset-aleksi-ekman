package s25.viikko1.domain;

public class Ystava {
    String firstName, lastName;

    public Ystava() {
    }

    public Ystava(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Ystava [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    
}
