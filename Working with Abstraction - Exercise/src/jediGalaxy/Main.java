package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int [] [] createMatrix(int x, int y) {
        int[][] matrix = new int[x][y];

        int value = 0;
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                matrix[i][j] = value++;
            }
        }

        return matrix;
    }

    public static long getStars(int [] []matrix, Scanner scanner){
        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] coordinates = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] evil = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int xEvil = evil[0];
            int yEvil = evil[1];

            while (xEvil >= 0 && yEvil >= 0)
            {
                if (xEvil >= 0 && xEvil < matrix.length && yEvil >= 0 && yEvil < matrix[0].length)
                {
                    matrix[xEvil] [yEvil] = 0;
                }
                xEvil--;
                yEvil--;
            }

            int X = coordinates[0];
            int Y = coordinates[1];

            while (X >= 0 && Y < matrix[1].length)
            {
                if (X >= 0 && X < matrix.length && Y >= 0 && Y < matrix[0].length)
                {
                    sum += matrix[X][Y];
                }

                Y++;
                X--;
            }

            command = scanner.nextLine();
        }

       return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [][] matrix = createMatrix(dimensions[0], dimensions[1]);

        System.out.println(getStars(matrix, scanner));


    }
}
