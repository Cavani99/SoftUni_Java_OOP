package Birthday_Celebrations;

public class Robot implements Identifiable {

    private String id;

    public String getModel() {
        return this.model;
    }

    private String model;

    public Robot(String id, String model){
        this.id = id;
        this.model = model;
    }
    @Override
    public String getId() {
        return this.id;
    }

}
