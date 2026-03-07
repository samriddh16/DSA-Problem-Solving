import java.util.Arrays;

public class Array17_SumOfEvenAfterQueries {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[][] queries= {{1,0},{-3,1},{-4,0},{2,3}};
        int sum_even= 0;
        int[] output= new int[queries.length];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum_even+=arr[i];
            }
        }
        for(int i = 0; i<queries.length; i++){
            int val = queries[i][0];
            int index = queries[i][1];

            if(arr[index]%2==0){
                sum_even-=arr[index];
            }
            arr[index]+=val;
            if(arr[index]%2==0){
                sum_even+=arr[index];
            }
            output[i]=sum_even;
        }
        System.out.println(Arrays.toString(output));
    }
}
