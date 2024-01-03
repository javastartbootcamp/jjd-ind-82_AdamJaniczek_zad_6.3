package pl.javastart.task;

public class Array {

    int[][] createArray(int row, int column) {
        if ((row & column) <= 100) {
            return new int[row][column];
        } else {
            System.out.println("Maksymalny rozmiar tablicy to 100 x 100");
        }
        return new int[0][0];
    }

    void fillArray(int[][] array) {
        int[][] result = array;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                result[row][column] = row * column;
            }
        }
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%5d |", result[row][column]);
            }
            System.out.println();
        }
    }
}
