import java.util.ArrayList;

public class Initializer {
    public static void main(String[] args) throws CloneNotSupportedException {
        ComputerShop shop1 = new ComputerShop();
        shop1.setShop("Colombo");
        shop1.initializeComputers();

        ComputerShop shop2 = (ComputerShop) shop1.clone();
        shop2.setShop("Kandy");

        System.out.println(shop1);
        System.out.println(shop2);
    }
}
