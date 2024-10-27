package Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String getName() {
        return name;
    }

    private String name;

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private double money;

    public List<Product> getProducts() {
        return products;
    }

    private List<Product> products;

    public Person(String name, double money){
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product){
        if(product.getCost() > this.money){
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.getName(), product.getName()));
        } else {
            System.out.println(String.format("%s bought %s",this.getName(),product.getName()));
            this.setMoney(this.money - product.getCost());
            products.add(product);
        }
    }

}
