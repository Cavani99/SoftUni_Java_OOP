import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflection = Reflection.class;

        System.out.println(reflection);
        System.out.println(reflection.getSuperclass());
        Class [] interfaces = reflection.getInterfaces();
        for (Class aInterface : interfaces) {
            System.out.println(aInterface);
        }

        Object reflectObj = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectObj);
    }
}
