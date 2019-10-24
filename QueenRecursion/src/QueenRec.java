import java.util.Scanner;

public class QueenRec {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] board = new int[row][col];

        //DisplayBoard(board[0]);
        findSolution(board[0],0);
    }

    public static boolean findSolution(int[] board,int col) {
        //if(findSolution([board],col)
            //return true;
        int q = 0;

        for(int i = 0; i < board.length; i++) {
            for (int n = 0; n < board.length; n++){
                board[i] = q;
                board[n] = q;
            }
            if(isValid(board[]))

            //DisplayBoard(board[],i,n);
        }


        return true;
    }

    public static void DisplayBoard(int[] board, int col, int row){

        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {

                System.out.print('X');
            }
            System.out.print('\n');
        }

    }

public static boolean isValid(int [] board,int row, int col){
        if(board[row]== 'X')
        return true;

}


}



