public class BoardTest {
    // מדפיס שני לוחות
    public static void main(String[] args) {
        Board board = new Board(); // create a new board
        System.out.println(board);
        Board board1 = new Board(5,5); // create a second new board
        System.out.println(board1);
    }
}
