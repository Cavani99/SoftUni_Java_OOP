import java.util.Scanner;

public class Rhombus_of_Stars {

    public static void printRow(int size, int stars){
        for (int i = 0; i < size - stars; i++)
            System.out.print(" ");
        for (int col = 1; col < stars; col++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }

    public static void createRhombus(int size) {

        for (int i = 1; i <= size; i++) {
            printRow(size, i);
        }

        for (int i = size - 1; i >= 1; i--) {
           printRow(size, i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        createRhombus(size);
    }
}