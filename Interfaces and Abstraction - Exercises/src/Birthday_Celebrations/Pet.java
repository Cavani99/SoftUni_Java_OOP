package Birthday_Celebrations;

public class Pet implements Birthable{
    public String getName() {
        return this.name;
    }

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
