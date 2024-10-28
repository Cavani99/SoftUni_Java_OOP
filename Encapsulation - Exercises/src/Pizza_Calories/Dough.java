package Pizza_Calories;

public class Dough {
    private void setFlourType(String flourType) {
        if(flourType.equals("White") || flourType.equals("Wholegrain")){
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if(bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight){
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public double calculateCalories(){
        double typeCalories = 1.0;
        switch (this.flourType){
            case "White":
                typeCalories = 1.5;
                break;
            case "Wholegrain":
                typeCalories = 1.0;
                break;
        }

        switch (this.bakingTechnique){
            case "Crispy":
                return (2 * this.weight) * typeCalories * 0.9;
            case "Chewy":
                return (2 * this.weight) * typeCalories * 1.1;
            case "Homemade":
                return (2 * this.weight) * typeCalories * 1.0;
        }

        return (2 * this.weight) * typeCalories * 1.0;
    }

}
