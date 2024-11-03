package Food_Shortage;

public class Citizen implements Identifiable, Person, Buyer {
    private String name;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    private int age;
    private String id;
    private String birthDate;
    private int food;

    @Override
    public String getId() {
        return this.id;
    }

    public Citizen(String name, int age, String id, String birthDate){
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
