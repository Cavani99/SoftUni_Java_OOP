package Create_Annotation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        System.out.println(Arrays.toString(testClass.getAnnotations()));
    }
}
