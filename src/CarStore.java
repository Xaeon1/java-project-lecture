import java.util.List;

public class CarStore extends Store implements Restock {
    @Override
    public void restock() {
        List<Product> products = this.getProducts();
        for (Product product : products) {
            if (product.getQuantity() < 2) {
                product.setQuantity(product.getQuantity() + 5);
            }
        }
    }
}
