
public class Board {
    private int[][] board;
    // creating a board size variables 
    int k;
    int c;
    
    

    public Board() {
        // creating a new board
        k = 3;
        c = 3;

        this.board = new int[k][c];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < c; j++) {
                this.board[i][j] = 0;
            }
        }
    }

    public Board(int a, int d){
        k = a;
        c = d;

        this.board = new int[k][c];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < c; j++) {
                this.board[i][j] = 0;
            }
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < c; j++) {
                sb.append("[");

                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

