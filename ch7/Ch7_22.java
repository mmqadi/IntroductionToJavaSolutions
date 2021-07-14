package ch7;

import java.util.Arrays;

public class Ch7_22 {
    public static void main(String[] args){
        int size = 8;
        int[] board = createBoard(size);//new int[]{0,6,4,7,1,3,5,2};
        getSolution(board);
        displayBoard(board);


    }

    private static void displayBoard(int[] board) {
        for(int i = 0; i < board.length; i++){
            System.out.print("|");
            for (int k : board) {
                if (k == i) {
                    System.out.print(" Q");
                } else {
                    System.out.print("  ");
                }
                System.out.print(" |");
            }
            System.out.println();
        }

    }

    /**
     * BUG: the programm runs in an infinite loop for some cases. This is due to the allocation of the last queen resulting in no solution.
     *
     */
    private static void getSolution(int[] board) {
        int queen = 0;
        while(!isSolution(board)){
            int row = (int)(Math.random() * board.length);
            if(isValidMove(board, queen, row)) {
                board[queen] = row;
                queen++;
            }
          //  displayBoard(board);

        }
    }

    private static boolean isValidMove(int[] board, int queen, int row) {
        return horizontalCheck(board, row) && diagonalCheck(board, queen, row);
    }

    private static boolean diagonalCheck(int[] board,int queen, int row) {

        for(int i = 0; i < board.length; i++){
            if(-board[i] + i == queen - row && board[i] != -1)
                return false;
            if(-board[i] - i == -queen - row && board[i] != -1)
                return false;
        }
        return true;
    }

    private static boolean horizontalCheck(int[] board, int row) {
        for (int j : board) {
            if (j == row)
                return false;
        }

        return true;
    }

    private static boolean isSolution(int[] board) {
        for (int j : board) {
            if (j == -1)
                return false;
        }
        return true;
    }

    private static int[] createBoard(int size) {
        int[] board = new int[size];
        Arrays.fill(board, -1);
        return  board;
    }


}
