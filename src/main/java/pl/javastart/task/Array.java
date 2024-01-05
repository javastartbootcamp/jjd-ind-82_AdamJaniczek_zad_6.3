package pl.javastart.task;

import java.util.Scanner;

public class Array {

    int[][] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy");
        int row = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int column = scanner.nextInt();
        if ((row & column) <= 100) {
            return new int[row][column];
        }
        return null;
    }

    void fillArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = row * column;
            }
        }
    }

    public void printArray(int[][] array) {
        for (int[] row : array) {
            for (int cell : row) {
                System.out.printf("%5d |", cell);
            }
            System.out.println();
            System.out.print("_".repeat(7).repeat(row.length));
        }
    }
}