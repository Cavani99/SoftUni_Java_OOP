package Border_Control;

public class Robot implements Identifiable{
    private String id;

    public String getModel() {
        return this.model;
    }

    private String model;

    public Robot(String model, String id){
        this.id = id;
        this.model = model;
    }
    @Override
    public String getId() {
        return this.id;
    }

}
