import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee(
                "Ivan",
                "Georgiev",
                20,
                "male",
                "candidate",
                1200,
                0
        );

        Employee secondEmployee = new Employee(
                "Hristo",
                "Todorov",
                36,
                "male",
                "candidate",
                1200,
                0
        );

        Employee[] candidates = new Employee[2];
        candidates[0] = firstEmployee;
        candidates[1] = secondEmployee;

        ToyStore store = new ToyStore();
        store.chooseEmployees(candidates);
    }

    public static List<Product> filterProductsByColor(Product[] products, String color) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product product: products) {
            if (product.getColor().equals(color)) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    public static List<Colored> filterProductsByColor(Colored[] products, String color) {
        ArrayList<Colored> filteredProducts = new ArrayList<>();
        for (Colored product: products) {
            if (product.getColor().equals(color)) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    public static Colored createColoredObj(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("TOY")) {
            return new Toy(1, "Toy", "", 1, 1, 0);
        }

        if (type.equalsIgnoreCase("Car")) {
            return new Car(1, "Toy", "", 1, 1);
        }
        
        return null;
    }
}
