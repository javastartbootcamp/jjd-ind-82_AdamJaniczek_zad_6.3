package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy");
        int row = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int column = scanner.nextInt();
        int[][] array = arr.createArray(row, column);
        arr.fillArray(array);
    }
}