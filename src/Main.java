import Product.Product;
import Recepie.Recipie;
import Product.ProductList;
import Recepie.RecepieList;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Product.ProductAlreadyExistException {

        ProductList spisok = new ProductList();
        Product milk = new Product("Молоко", 115, 1);
        Product grecha = new Product("Гречка", 135, 1);
        Product strawberries = new Product("Земляника", 105, 0);
        Product blueberries = new Product("Голубика", 178, 0);
        Product cottageCheese = new Product("Творог", 126, 0);
        Product honey = new Product("Мед", 149, 1);
        spisok.addProduct(milk);
        spisok.addProduct(strawberries);
        spisok.addProduct(blueberries);
        spisok.addProduct(cottageCheese);
        spisok.addProduct(honey);
        System.out.println(spisok);
        spisok.checkProduct("Молоко");
        spisok.checkProduct("Гречка");
        spisok.checkProduct("Земляника");
        spisok.checkProduct("Голубика");
        spisok.checkProduct("Творог");
        spisok.checkProduct("Мед");
        System.out.println(spisok);
        Set<Product> products = new HashSet<>();
        products.add(blueberries);
        products.add(cottageCheese);
        products.add(milk);
        Recipie breakfast = new Recipie("Завтрак", products);
        System.out.println(breakfast);
        System.out.println("Стоимость продуктов в рецепте: " + breakfast.getRecipiePrice() + " рублей");
    }

}