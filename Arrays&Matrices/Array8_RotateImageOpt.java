import java.util.Arrays;

// Rotating 90D Clockwise
public class Array8_RotateImageOpt {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            int l=0,k=arr[i].length-1;
            while(l<k){
                int temp=arr[i][l];
                arr[i][l]=arr[i][k];
                arr[i][k]=temp;
                l++;
                k--;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
