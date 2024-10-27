package Shopping_Spree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] people = scanner.nextLine().split(";");
        LinkedHashMap<String, Person> personHashMap= new LinkedHashMap<>();
        Person person;
        for (int i = 0; i < people.length; i++) {
            String [] values = people[i].split("=");
            person = new Person(values[0], Double.parseDouble(values[1]));
            personHashMap.put(person.getName(), person);
        }

        String [] food = scanner.nextLine().split(";");
        LinkedHashMap<String, Product> products = new LinkedHashMap<>();
        Product product;
        for (int i = 0; i < food.length; i++) {
            String [] values = food[i].split("=");
            product = new Product(values[0], Double.parseDouble(values[1]));
            products.put(product.getName(), product);
        }

        String [] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("END")){
            person = personHashMap.get(command[0]);
            product = products.get(command[1]);
            person.buyProduct(product);
            personHashMap.put(person.getName(), person);

            command = scanner.nextLine().split("\\s+");
        }

         for (Map.Entry<String, Person> entry : personHashMap.entrySet()){
             person = entry.getValue();
             if(person.getProducts().isEmpty()){
                 System.out.println(String.format("%s - Nothing bought", person.getName()));
             } else {
                 String bought = String.join(", ",
                         person.getProducts().stream()
                                 .map(Product::getName)
                                 .toList()
                 );
                 System.out.println(String.format("%s - %s", person.getName(), bought));
             }
         }
    }
}
