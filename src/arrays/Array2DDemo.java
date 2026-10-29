package arrays;

/**
 * Module 04: two-dimensional arrays and nested loops.
 */
public class Array2DDemo {

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printGrid(grid);
        System.out.println("Sum: " + sum(grid));
        System.out.println("Transpose:");
        printGrid(transpose(grid));
    }

    static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }

    static int sum(int[][] grid) {
        int total = 0;
        for (int[] row : grid) {
            for (int value : row) {
                total += value;
            }
        }
        return total;
    }

    static int[][] transpose(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] result = new int[columns][rows];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                result[column][row] = grid[row][column];
            }
        }
        return result;
    }
}
