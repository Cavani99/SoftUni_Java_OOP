package Random_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        RandomArrayList randomArrayList = new RandomArrayList();
        for (int i = 0; i < 100; i++) {
            randomArrayList.add(i);
        }
        System.out.println(randomArrayList.getRandomElement());

    }
}
