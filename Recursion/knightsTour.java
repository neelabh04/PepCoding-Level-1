public class knightsTour {
    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        // subtle baat 3 -> can lead to array index out of bound
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] != 0){ 
            return;
        } else if(upcomingMove == chess.length * chess.length){
            // subtle baat 1 -> you would see 1 to 24 and 0 in 25th spot
            chess[r][c] = upcomingMove; 
            displayBoard(chess);
            // subtle baat 2 -> you would get just one answer
            chess[r][c] = 0; 
            return;
        }
        chess[r][c] = upcomingMove;
        printKnightsTour(chess, r - 2, c + 1, upcomingMove + 1);
        printKnightsTour(chess, r - 1, c + 2, upcomingMove + 1);
        printKnightsTour(chess, r + 1, c + 2, upcomingMove + 1);
        printKnightsTour(chess, r + 2, c + 1, upcomingMove + 1);
        printKnightsTour(chess, r + 2, c - 1, upcomingMove + 1);
        printKnightsTour(chess, r + 1, c - 2, upcomingMove + 1);
        printKnightsTour(chess, r - 1, c - 2, upcomingMove + 1);
        printKnightsTour(chess, r - 2, c - 1, upcomingMove + 1);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
