public abstract class Vehicle {
    private String name;
    private int year;
    private double rpm;

    Vehicle(String name, int year, double rpm) {
        this.name = name;
        this.year = year;
        this.rpm = rpm;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRpm() {
        return rpm;
    }
}
