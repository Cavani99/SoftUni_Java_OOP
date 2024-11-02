package Border_Control;

public class Citizen implements Identifiable{
    private String name;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public String getId() {
        return this.id;
    }
}
