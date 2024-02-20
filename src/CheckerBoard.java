public class CheckerBoard {

    public static String checkBoard(int rows, int columns) {

        String board = "";



        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
             board += (i + j) % 2 == 0 ? "*" : " ";
            }
             board += '\n';

        }

      return board;
    }


    public static void main(String[] args) {
     int   rows = 8;
     int   columns = 8;

      String checkBoardPattern  = (checkBoard(rows,columns));

        System.out.println(checkBoardPattern);

    }
}

