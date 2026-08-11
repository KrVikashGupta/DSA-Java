// public class NQueens {
//     public static boolean isSafe(char board[][], int rows, int col) {
//         //vertical up
//         for(int i = rows-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //..left up
//         for(int i =rows-1, j=col-1; i>=0 && j>=0; i--,j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         for(int i=rows-1, j=col+1;i>=0 && j<board.length;i--,j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
        
//     }
//     public static void nQueens(char board[][], int rows) {
//         //base case
//         if(rows == board.length) {
//             printboard(board);
//             return;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board,rows,j)) {
//                 board [rows][j] = 'Q';
//             nQueens(board, rows+1);
//             board[rows][j] ='X';
//         }
//     }
//     }
//     public static void printboard(char board[][]) {
//         System.out.println("---CHESSBOARD---");
//         for(int i=0; i<board.length;i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         int n=4;
//         char board[][] = new char[n][n];
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'X';
//             }
//         }
//         nQueens(board,0);
//     }
// }



//2 nd method

// public class NQueens {
//     public static boolean isSafe(char board[][], int rows, int col) {
//         //vertical up
//         for(int i = rows-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //..left up
//         for(int i =rows-1, j=col-1; i>=0 && j>=0; i--,j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         for(int i=rows-1, j=col+1;i>=0 && j<board.length;i--,j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
        
//     }
//     public static void nQueens(char board[][], int rows) {
//         //base case
//         if(rows == board.length) {
//             //printboard(board);
//             count++;
//             return;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board,rows,j)) {
//                 board [rows][j] = 'Q';
//             nQueens(board, rows+1);
//             board[rows][j] ='X';
//         }
//     }
//     }
//     public static void printboard(char board[][]) {
//         System.out.println("---CHESSBOARD---");
//         for(int i=0; i<board.length;i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     static int count = 0;
//     public static void main(String args[]) {
//         int n=5;
//         char board[][] = new char[n][n];
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'X';
//             }
//         }
//         nQueens(board,0);
//         System.out.println("Total ways to solve n Queens : " + count);
//     }
// }

//3rd method

public class NQueens {
    public static boolean isSafe(char board[][], int rows, int col) {
        //vertical up
        for(int i = rows-1; i>=0; i--) {
            if(board[i][col] == 'Q') {  
                return false;
            }
        }
        //..left up
        for(int i =rows-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        for(int i=rows-1, j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }
    public static boolean nQueens(char board[][], int rows) {  // void change to boolean
        //base case
        if(rows == board.length) {
            //printboard(board);
            count++;
            return true;  // return change to return true
        }
        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board,rows,j)) {
                board [rows][j] = 'Q';
             if(nQueens(board, rows+1)) {  //add if condition
                return true;
             }
            board[rows][j] ='X';
        }
    }
    return false;// change in this line  if not true than false 

    }
    public static void printboard(char board[][]) {
        System.out.println("---CHESSBOARD---");
        for(int i=0; i<board.length;i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String args[]) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'X';
            }
        }
        if(nQueens(board,0)) {  // return true ya false print karna hai 
            System.out.println("Solution is possible");
        }
        else {
            System.out.println("Solution is not possible");
        }
        //System.out.println("Total ways to solve n Queens : " + count);
    }
}
