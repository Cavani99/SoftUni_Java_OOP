package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);


        Constructor<BlackBoxInt> constructor = BlackBoxInt.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        BlackBoxInt blackBoxInt = constructor.newInstance();

        Method[] methods = blackBoxInt.getClass().getDeclaredMethods();

        Field innerValue = blackBoxInt.getClass().getDeclaredField("innerValue");

        String [] command = scanner.nextLine().split("_");

        innerValue.setAccessible(true);
        while (!command[0].equals("END")){
            int value = Integer.parseInt(command[1]);
            String finalCommand = command[0];

            Method method = Arrays.stream(methods)
                    .filter(m -> m.getName().equalsIgnoreCase(finalCommand))
                    .findFirst().orElse(null);

            method.setAccessible(true);
            method.invoke(blackBoxInt, value);
            System.out.println(innerValue.get(blackBoxInt));

            command = scanner.nextLine().split("_");
        }
    }
}
