public class Toy extends Product {
    private int ageGroupUpper;

    public Toy(int id, String name, String brand, double price, int quantity, int ageGroupUpper) {
        super(id, name, brand, price, quantity);
        this.ageGroupUpper = ageGroupUpper;
    }

    @Override
    public void recalculatePrice() {
        // 10 => 20%, 18 => 12%,

        if (this.ageGroupUpper <= 10) {
            this.setPrice(this.getPrice() * 1.2);
        } else if (this.ageGroupUpper <= 18) {
            this.setPrice(this.getPrice() * 1.18);
        }
    }
}
