import java.util.HashSet;
import java.util.Set;

public class Array31_ValidSudoku_IIndApproach {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        int m = board.length;
        int n = board[0].length;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '.') continue;

                String row = board[i][j] + "row-"+i;       // It is important to include row string here as both column and row can have same values
                String col = board[i][j] + "col-"+j;       // It is important to include column string here as both column and row can have same values
                String box = board[i][j] + "box-"+i/3+"-"+j/3;     // We can also include box string here (not necessary)

                if(set.contains(row) || set.contains(col) || set.contains(box)){
                    System.out.println("False");
                    return;
                }
                set.add(row);
                set.add(col);
                set.add(box);

            }
        }
        System.out.println("True");
    }
}
