public class App {
    public static void main(String[] args) {
        Owner owner = new Owner(" Nadia Rafidah");
        Car car = new Car(owner, "Honda HR-V", 2022, 1500);
        car.displayInformation();
        System.out.println();
        Owner owner2 = new Owner(" Yuandini Kartika");
        Car car2 = new Car(owner2, "Toyota Corolla Altis", 2020, 1800);
        car2.displayInformation();
        System.out.println();
        Owner owner3 = new Owner(" Khansa Ausyi");
        Car car3 = new Car(owner3, "Honda City", 2019, 1600);
        car3.displayInformation();
        System.out.println();
        Owner owner4 = new Owner(" Adinda Riveria");
        Car car4 = new Car(owner4, "Toyota Fortuner", 2020, 2000);
        car4.displayInformation();
        System.out.println();
    }
}
