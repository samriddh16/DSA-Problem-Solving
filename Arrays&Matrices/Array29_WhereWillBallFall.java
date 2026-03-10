import java.util.Arrays;

public class Array29_WhereWillBallFall {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        int m = grid.length;
        int n = grid[0].length;
        int[] bool = new int[grid[0].length];
        for (int i = 0; i < n; i++) {
            int row=0;
            int col=i;
            boolean state=true;           // This has to be inside the for loop as for every ball it
            while(row<m && col<n){        // has to reset and if it will not then it remains false forever
                if(grid[row][col]==1){
                    if(col+1>=n || grid[row][col+1]==-1){
                        state=false;
                        break;
                    }
                    col++;
                }else{
                    if(col-1<0 || grid[row][col-1]==1){
                        state=false;
                        break;
                    }
                    col--;
                }
                row++;
            }
            if(state){
                bool[i]=col;
            }
            else{
                bool[i]=-1;
            }
        }
        System.out.println(Arrays.toString(bool));
    }
}
