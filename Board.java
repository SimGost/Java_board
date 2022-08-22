
public class Board {
    private int[][] board;
    int k;
    int c;
    public void setsize(int a,int d){
        k = a;
        c = d;
    } 
    

    
    

    public Board() {
        // create a new board
        setsize(5, 7);
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

