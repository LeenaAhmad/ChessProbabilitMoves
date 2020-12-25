
package dshw1;

import java.util.Scanner;

/**
 *
 * @author leenaahmad
 */
public class DSHW1 {

 
       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("This program will find the possible moves for the knight..");
        System.out.print("Enter the current position of the knight " + "\n1. Row#: ");
        int row = input.nextInt();
        System.out.print("2. Column#: ");
        int column = input.nextInt();
        int[][] knight = new int[8][8];
        int count = 0;

        if (row < 8 && column < 8) {

            if (row + 2 >= 0 && row + 2 < 8 && column + 1 >= 0 && column + 1 < 8) {
                knight[row + 2][column + 1] = 1;
            }
            if (row + 2 >= 0 && row + 2 < 8 && column - 1 >= 0 && column - 1 < 8) {
                knight[row + 2][column - 1] = 1;
            }

            if (row - 2 >= 0 && row - 2 < 8 && column + 1 >= 0 && column + 1 < 8) {
                knight[row - 2][column + 1] = 1;
            }
            if (row - 2 >= 0 && row - 2 < 8 && column - 1 >= 0 && column - 1 < 8) {
                knight[row - 2][column - 1] = 1;
            }

            if (row + 1 >= 0 && row + 1 < 8 && column + 2 >= 0 && column + 2 < 8) {
                knight[row + 1][column + 2] = 1;
            }
            if (row + 1 >= 0 && row + 1 < 8 && column - 2 >= 0 && column - 2 < 8) {
                knight[row + 1][column - 2] = 1;
            }
            if (row - 1 >= 0 && row - 1 < 8 && column + 2 >= 0 && column + 2 < 8) {
                knight[row - 1][column + 2] = 1;
            }
            if (row - 1 >= 0 && row - 1 < 8 && column - 2 >= 0 && column - 2 < 8) {
                knight[row - 1][column - 2] = 1;
            }

            System.out.println("You can move the knight to: ");

            for (int Row = 0; Row < 8; Row++) {
                for (int Column = 0; Column < 8; Column++) {
                    if (knight[Row][Column] == 1) {
                        count++;
                        System.out.println(count + ". Row#: " + Row + ", Column#: " + Column);
                    }
                }
            }
        } else {
            System.out.println(" No possible locations");
        }

    }
}