public class Car extends Product {

    public Car(int id, String name, String brand, double price, int quantity) {
        super(id, name, brand, price, quantity);
    }

    @Override
    public void recalculatePrice() {
    }
}
