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

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d |", array[i][j]);
            }
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("_".repeat(7));
            }
            System.out.println();
        }
    }
}