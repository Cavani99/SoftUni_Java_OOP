package Say_Hello_Extended;

public abstract class BasePerson implements Person{
    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String name;
    protected BasePerson(String name) {
        this.setName(name);
    }
}
