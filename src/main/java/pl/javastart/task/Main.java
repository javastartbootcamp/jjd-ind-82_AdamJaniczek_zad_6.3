package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array();
        int[][] array = arr.createArray();
        if (array != null) {
            arr.fillArray(array);
            arr.printArray(array);
        } else {
            System.out.println("Maksymalny rozmiar tablicy to 100 x 100");
        }

    }
}