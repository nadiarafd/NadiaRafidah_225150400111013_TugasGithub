
import java.util.Date;

public abstract class Employee {
    private String name;
    private String noKTP;
    private Date birthDate;

    public Employee(String name, String noKTP, Date birthDate) {
        this.name = name;
        this.noKTP = noKTP;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Name: %s\nNo. KTP: %s\nBirth Date: %s", getName(), getNoKTP(), getBirthDate());
    }

    public abstract double earnings();
}