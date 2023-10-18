import java.util.List;

public class ToyStore extends Store implements Restock {
    @Override
    public void restock() {
        List<Product> products = this.getProducts();
        for (Product product: products) {
            if (product.getQuantity() < 50) {
                product.setQuantity(product.getQuantity() + 100);
            }
        }
    }
}
