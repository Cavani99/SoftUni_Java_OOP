package Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public String getName() {
        return name;
    }

    private String name;

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private Dough dough;

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int topping) {
        if(topping > 10  || topping < 0){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.capacity = topping;
        this.toppings = new ArrayList<>(topping);
    }

    private List<Topping> toppings;

    private int capacity;

    public Pizza(String name, int numberOfToppings){
        this.setName(name);
        this.capacity = numberOfToppings;
        this.setToppings(numberOfToppings);
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getOverallCalories(){
        double doughCalories = this.dough.calculateCalories();
        double toppingsCalories = 0;

        Topping topping;
        for (int i = 0; i < toppings.size(); i++) {
            toppingsCalories += toppings.get(i).calculateCalories();
        }

        return doughCalories + toppingsCalories;
    }
}
