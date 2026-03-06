public class Array9_SpiralMatrix_I {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int top=0,down=matrix.length-1,left=0,right=matrix[0].length-1;
        int id=0;
        while(top<=down && left<=right){
            if(id==0){
                for(int i=left;i<=right;i++){
                    System.out.print(matrix[top][i]+" ");
                }
                top++;
            }

            if(id==1){
                for(int i=top;i<=down;i++){
                    System.out.print(matrix[i][right]+" ");
                }
                right--;
            }

            if(id==2){
                for(int i=right;i>=left;i--){
                    System.out.print(matrix[down][i]+" ");
                }
                down--;
            }

            if(id==3){
                for(int i=down;i>=top;i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
            id=(id+1)%4;
        }
    }
}
