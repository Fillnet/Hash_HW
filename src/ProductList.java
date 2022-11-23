import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private static final Set<Product> products = new HashSet<>();


    public void addProduct(Product product) throws ProductAlreadyExistException {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new ProductAlreadyExistException();

    }else{
        this.products.add(product);
    }

}

    public void checkProduct(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)&&product.getQuantity() > 0) {
                product.setChecked();
                break;
            }

        }
    }

    public void removeProduct(String name) {
        Iterator<Product> productsIterator = this.products.iterator();
        while (productsIterator.hasNext()) {
            if (productsIterator.next().getName().equals(name)) {
                productsIterator.remove();
                break;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов: ").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
