package WildFarm;

public abstract class Food {
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    private Integer quantity;

    public Food(Integer quantity){
        this.setQuantity(quantity);
    }
}
