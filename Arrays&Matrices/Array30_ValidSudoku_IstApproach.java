import java.util.HashSet;
import java.util.Set;

public class Array30_ValidSudoku_IstApproach {

    public static boolean isValidSudoku(char[][] board, int startRow, int endRow, int startCol, int endCol) {
        Set<Character> set = new HashSet<>();
        for (int row = startRow; row <= endRow; row++) {
            set.clear();
            for (int col = startCol; col <= endCol; col++) {
                if(board[row][col]=='.')
                    continue;
                if(!set.contains(board[row][col]))
                    set.add(board[row][col]);
                else
                    return false;
            }
        }
        return true;
    }

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

        Set<Character> r_set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            r_set.clear();
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]=='.')
                    continue;
                if(!r_set.contains(board[i][j])){
                    r_set.add(board[i][j]);
                }else{
                    System.out.println("False");
                    return;
                }
            }
        }
        r_set.clear();

        for (int j = 0; j < board[0].length; j++) {
            r_set.clear();
            for (int i = 0; i < board.length; i++) {
                if(board[i][j]=='.')
                    continue;
                if(!r_set.contains(board[i][j])){
                    r_set.add(board[i][j]);
                }else{
                    System.out.println("False");
                    return;
                }
            }
        }

        for(int i=0 ; i<board.length ; i+=3){
            int endRow = i+2;
            for(int j=0 ; j<board[i].length ; j+=3){
                int endCol = j+2;
                if(!isValidSudoku(board,i,endRow,j,endCol)){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
