package Multiple_Implementation;

public class Citizen implements Identifiable, Birthable, Person{
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

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public Citizen(String name, int age, String id, String birthDate){
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
