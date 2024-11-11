package Create_Annotation;

import java.lang.annotation.Annotation;

@Subject(categories = {"Test", "Annotations"})
public class TestClass {

    public Annotation [] getAnnotations() {
        return TestClass.class.getDeclaredAnnotations();
    }

}
