public class NQueensFirstSolution {
    static boolean isSafe(char board[][], int row, int col){
        // vertical
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        // diag right
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        // diag left
        for (int i = row-1, j = col-1; i >= 0 && j >=0; i--, j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }

    static boolean NQ(char board[][], int row){
        if (row == board.length) {
            count++;
            return true;
        }
        
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                if(NQ(board,row+1)){
                    return true;
                }
                board[row][i] = 'x';    //backtracking step
            }
        }
        return false;
    }

    static void printBoard(char board[][]){
        System.out.println("--------chessboard-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {            // O(n*n!)
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        if (NQ(board, 0)) {
            System.out.println("Solution is Possible");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not Possible");
        }
    }
}
