public class MainCake {
    public static void main(String[] args) {
        Cake[] cakeArray = new Cake[20];

        cakeArray[0] = new CustomCake("Chocolate Cake", 10.0, 0.5);
        cakeArray[1] = new ReadyMadeCake("Donut", 2.5, 10);
        cakeArray[2] = new CustomCake("Brownies", 15.0, 0.8);
        cakeArray[3] = new ReadyMadeCake("Lapis Legit", 30.0, 5);
        cakeArray[4] = new CustomCake("Strawberry Cake", 15.0, 0.5);
        cakeArray[5] = new ReadyMadeCake("Klepon", 2.5, 0.9);
        cakeArray[6] = new CustomCake("Cheese Cake", 15.0, 0.5);
        cakeArray[7] = new ReadyMadeCake("Lemper", 3.0, 1.0);
        cakeArray[8] = new CustomCake("Bugis Mandi Cake", 20.0, 1.5);
        cakeArray[9] = new ReadyMadeCake("Onde-onde", 2.0, 1.0);
        cakeArray[10] = new CustomCake("Nagasari", 18.0, 1.5);
        cakeArray[11] = new CustomCake("Cucur Cake", 5.0, 0.5);
        cakeArray[12] = new ReadyMadeCake("Talam Cake", 3.5, 0.9);
        cakeArray[13] = new CustomCake("Bikang", 10.0, 0.8);
        cakeArray[14] = new ReadyMadeCake("Serabi", 25.0, 5);
        cakeArray[15] = new CustomCake("Mendut", 9.0, 0.5);
        cakeArray[16] = new ReadyMadeCake("Wajik", 1.5, 0.9);
        cakeArray[17] = new CustomCake("Putu Ayu", 10.0, 1.5);
        cakeArray[18] = new ReadyMadeCake("Muffin", 3.0, 1.0);
        cakeArray[19] = new CustomCake("Lumpur Cake", 20.0, 1.5);

        System.out.println("List of Cakes:");
        for (Cake cake : cakeArray) {
            if (cake != null) {
                System.out.println(cake.getClass().getSimpleName() + ": " + cake);
            }
        }

        double totalPrice = 0.0;
        for (Cake cake : cakeArray) {
            if (cake != null) {
                totalPrice += cake.calculatePrice();
            }
        }
        System.out.println("Total Price of All Cakes: " + totalPrice);

        double totalCustomCakePrice = 0.0;
        double totalCustomCakeWeight = 0.0;
        for (Cake cake : cakeArray) {
            if (cake instanceof CustomCake) {
                totalCustomCakePrice += cake.calculatePrice();
                totalCustomCakeWeight += ((CustomCake) cake).weight;
            }
        }
        System.out.println("Total Price of Custom Cakes: " + totalCustomCakePrice);
        System.out.println("Total Weight of Custom Cakes: " + totalCustomCakeWeight + " kg");

        double totalReadyMadeCakePrice = 0.0;
        double totalReadyMadeCakeQuantity = 0.0;
        for (Cake cake : cakeArray) {
            if (cake instanceof ReadyMadeCake) {
                totalReadyMadeCakePrice += cake.calculatePrice();
                totalReadyMadeCakeQuantity += ((ReadyMadeCake) cake).quantity;
            }
        }
        System.out.println("Total Price of Ready-Made Cakes: " + totalReadyMadeCakePrice);
        System.out.println("Total Quantity of Ready-Made Cakes: " + totalReadyMadeCakeQuantity);

        Cake cakeWithHighestPrice = null;
        double highestPrice = 0.0;
        for (Cake cake : cakeArray) {
            if (cake != null && cake.calculatePrice() > highestPrice) {
                highestPrice = cake.calculatePrice();
                cakeWithHighestPrice = cake;
            }
        }
        System.out.println("Cake with the Highest Price: " + cakeWithHighestPrice);
    }
}
