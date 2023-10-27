import java.util.List;
import java.util.UUID;

public abstract class Store {
    private String name;
    private String address;
    private List<Product> products;

//    public Product selectProductById(UUID id) {
//    }
//
//    public Product[] selectProductsByBrandAndPriceBelow(String brand, double price) {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void chooseEmployees(Employee[] employees) {
        Employee[] selectedEmployees = new Employee[employees.length];
        int index = 0;
        for (Employee e : employees) {
            try {
                if (e.getSalary() >= 1000 && e.getSalary() <= 5000) {
                    if (e.getAge() >= 18 && e.getAge() < 65) {
                        selectedEmployees[index] = e;
                        index++;
                    } else {
                        throw new EmployeeSelectionException("Employees must be between 18 and 65 years old.");
                    }
                }
            } catch (EmployeeSelectionException ex) {
                System.out.println(ex.getMessage());
            }
        }
        for (int i = 0; i < index; i++) {
            Employee e = selectedEmployees[i];
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }
    }
}
