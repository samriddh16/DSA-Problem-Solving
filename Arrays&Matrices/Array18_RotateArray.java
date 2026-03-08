import java.util.Arrays;

// Not very good approach
public class Array18_RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k=3;
        int j=0;
        int n=nums.length;
        int[] arr= new int[n];
        for(int i=0 ; i<n ; i++){
            j = (i+k)%n;
            arr[j]=nums[i];
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0,l=0 ; i<n ; i++,l++){
            nums[i] = arr[l];
        }
        System.out.println(Arrays.toString(nums));
    }
}
