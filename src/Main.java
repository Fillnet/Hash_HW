import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws ProductAlreadyExistException {

        ProductList spisok = new ProductList();
        spisok.addProduct(new Product("Молоко", 115, 0));
        spisok.addProduct(new Product("Гречка",135,1));
        spisok.addProduct(new Product("Земляника",105,0));
        spisok.addProduct(new Product("Голубика",178,0));
        spisok.addProduct(new Product("Творог",126,0));
        spisok.addProduct(new Product("Мед",149,1));
        System.out.println(spisok);
        spisok.checkProduct("Молоко");
        spisok.checkProduct("Гречка");
        spisok.checkProduct("Земляника");
        spisok.checkProduct("Голубика");
        spisok.checkProduct("Творог");
        spisok.checkProduct("Мед");
        System.out.println(spisok);
    }


}