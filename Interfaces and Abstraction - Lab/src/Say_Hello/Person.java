package Say_Hello;

public interface Person {
    String getName();
    default String sayHello(){
        return "Hello";
    }
}
