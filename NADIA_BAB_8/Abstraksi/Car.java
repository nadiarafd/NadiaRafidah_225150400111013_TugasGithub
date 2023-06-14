public class Car extends Vehicle {
    private Owner owner;

    Car(Owner owner, String name, int year, double rpm) {
        super(name, year, rpm);
        this.owner = owner;
    }

    public void displayInformation() {
        System.out.println("Car name\t: " + getName());
        System.out.println("Car owner\t:" + owner.getName());
        System.out.println("Output year\t: " + getYear());
        System.out.println("RPM\t\t: " + getRpm());
    }
}
