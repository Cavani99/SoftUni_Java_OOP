package Food_Shortage;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Citizen> citizenList = new LinkedHashMap<>();
        LinkedHashMap<String, Rebel> rebels = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String [] vals = scanner.nextLine().split("\\s+");

            if(vals.length == 3) {
                if(!rebels.containsKey(vals[0]) && !citizenList.containsKey(vals[0])){
                    Rebel rebel = new Rebel(vals[0], Integer.parseInt(vals[1]), vals[2]);
                    rebels.put(vals[0], rebel);
                }
            } else {
                if(!rebels.containsKey(vals[0]) && !citizenList.containsKey(vals[0])){
                    Citizen citizen = new Citizen(vals[0], Integer.parseInt(vals[1]), vals[2], vals[3]);
                    citizenList.put(vals[0], citizen);
                }
            }
        }

        String name = scanner.nextLine();
        AtomicInteger food = new AtomicInteger();

        while (!name.equals("End")){
            if(rebels.containsKey(name)){
                rebels.get(name).buyFood();
            } else if(citizenList.containsKey(name)){
                citizenList.get(name).buyFood();
            }

            name = scanner.nextLine();
        }

        citizenList.entrySet().forEach(c -> food.addAndGet(c.getValue().getFood()));
        rebels.entrySet().forEach(rebel -> food.addAndGet(rebel.getValue().getFood()));

        System.out.println(food.get());

    }

}
