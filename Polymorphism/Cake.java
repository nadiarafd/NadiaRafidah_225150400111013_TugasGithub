abstract class Cake {
    public String name;
    public double price;

    public Cake(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();

    public String toString() {
        return "Cake " + name + ", Price: " + price;
    }
}

class CustomCake extends Cake {
    double weight;

    public CustomCake(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double calculatePrice() {
        return price * weight;
    }

    public String toString() {
        return super.toString() + ", Weight: " + weight + " kg";
    }
}

class ReadyMadeCake extends Cake {
    double quantity;

    public ReadyMadeCake(String name, double price, double quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public double calculatePrice() {
        return price * quantity * 2;
    }

    public String toString() {
        return super.toString() + ", Quantity: " + quantity;
    }
}
