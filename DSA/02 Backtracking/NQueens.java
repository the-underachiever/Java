class NQueens {

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

    static void NQ(char board[][], int row){
        if (row == board.length) {
            printBoard(board);
            return;
        }
        
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                NQ(board,row+1);
                board[row][i] = 'x';
            }
        }
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

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';  //backtracking step
            }
        }
        NQ(board, 0);

    }    
}