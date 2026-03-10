// Medium (But it should be hard)
public class Array26_ImageOverlap {

    public static int countOverlap(int[][] A, int[][] B, int rowOffset, int colOffset) {
        int n = A.length;
        int b_i=0, b_j=0;
        int count = 0;
        for (int i = 0; i < n; i++) {             // For each overlap counting no. of overlapping ones
            for (int j = 0; j < n; j++) {
                b_i= i+rowOffset;
                b_j= j+colOffset;
                if(b_j<0 || b_j>=n || b_i<0 || b_i>=n)
                    continue;
                if(A[i][j] == 1 && B[b_i][b_j]==1)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] A = {{1,1,0},{0,1,0},{0,1,0}};
        int[][] B = {{0,0,0},{0,1,1},{0,0,1}};
        int n = A.length;
        int maxOverlap = 0,count = 0;
        for(int i=-n+1 ; i<n ; i++){           // All row overlaps possible
            for(int j=-n+1 ; j<n ; j++){       // All column overlaps possible
                count = countOverlap(A,B,i,j);
                maxOverlap = Math.max(maxOverlap,count);
            }
        }
        System.out.println(maxOverlap);
    }
}
