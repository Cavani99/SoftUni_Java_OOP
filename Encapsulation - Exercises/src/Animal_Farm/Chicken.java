package Animal_Farm;

import java.util.Locale;

public class Chicken {
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0 || age >15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private String name;
    private int age;

    public Chicken(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public double productPerDay(){
       return this.calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        if(this.age < 6) {
            return 2.00;
        } else if(this.age >= 6 && this.age < 12) {
            return 1.00;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format(Locale.US,"Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, this.productPerDay());
    }
}
