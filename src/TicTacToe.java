import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board  = new char[3][3];
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                // initialize at first that board is empty
                board[row][col] = ' ';
            }
        }
        // either player will be x or 0
        char player = 'x';
        boolean gameover = false;
        Scanner sc = new Scanner(System.in);
        while(!gameover){
            printboard(board);
            System.out.println("player " + player + " enter: ");
            
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println();
            // if the space is empty then fill will either x or o , otherwise its invalid move
            if(board[row][col] == ' '){
              board[row][col] = player;
              gameover = haveWon(board , player);
              if(gameover){
                  System.out.println("player " + player + "has won: ");
              }else{
                  if(player == 'x'){
                      player = '0';
                  }else{
                      player = 'x';
                  }
              }
            }else{
                System.out.println("Invalid move. Try agin! ");
            }
        }
        printboard(board);
    }
    public static boolean haveWon(char[][] board , char player){
        //check for rows
        for (int row = 0; row < board.length; row++) {
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        // check for col
        for (int col = 0; col < board.length; col++) {
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        // checking for diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return false;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return false;
        }
        return false;
    }
    public static void printboard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
