package Class8.SlideExamples;

public class ChessBoard {
    public static void main(String[] args) {
        char chessBoard[][] = {
                {'r', 's', 'l', 'q', 'k', 'l', 's', 'r'},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {' ', ' ', ' ', ' ', ' ', ' ', 'E', 'A', 'D'},
                {' ', ' ', ' ', 'e', 'e', ' ', ' ', ' '},
                {' ', ' ', ' ', 'e', 'e', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'R', 'S', 'L', 'Q', 'K', 'L', 'S', 'R'}
        };

        System.out.printf("Value of element is %c", chessBoard[7][1]);
        System.out.print("\n");

        /* print one complete array of the two dimensional array */
        System.out.print("print one complete array of the two dimensional array\n");
        for (char figure : chessBoard[7]) {
            System.out.printf("%c ", figure);
        }
        System.out.print("\n");

        for (int i = 0; i < chessBoard[7].length; i++) {
            System.out.printf("%c ", chessBoard[7][i]);
        }
        System.out.print("\n");

        /* print all nested arrays of the two dimensional array */
        System.out.print("print all nested arrays of the two dimensional array\n");
        for (char[] figures : chessBoard) {
            for (char figure : figures) {
                System.out.printf("%c ", figure);
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.printf("%c ", chessBoard[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
