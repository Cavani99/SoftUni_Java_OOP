package Pizza_Calories;

public class Topping {
    private String toppingType;

    private void setToppingType(String toppingType) {
        if(toppingType.equals("Meat") || toppingType.equals("Veggies")
               || toppingType.equals("Cheese") || toppingType.equals("Sauce")){
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public double calculateCalories(){

        switch (this.toppingType){
            case "Meat":
                return (2 * this.weight) * 1.2;
            case "Veggies":
                return (2 * this.weight) * 0.8;
            case "Cheese":
                return (2 * this.weight) * 1.1;
            case "Sauce":
                return (2 * this.weight) * 0.9;
        }
        return 1.0;
    }
}
