public class BS4_Search2DMatrix {

    public static int binarySearch(int[][] matrix, int target, int row, int end) {
        int left =0, right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(matrix[row][mid] == target) {
                return mid;
            }else if(matrix[row][mid] > target) {
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++) {
            if(matrix[i][m-1] == target) {
                System.out.println(true);
                return;
            }else if(matrix[i][m-1] > target) {
                int idx = binarySearch(matrix,target,i,m-1);
                if(idx != -1) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
