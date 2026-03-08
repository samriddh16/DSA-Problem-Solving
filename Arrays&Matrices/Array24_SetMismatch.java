import java.util.Arrays;

public class Array24_SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int dup=-1;
        int val=-1;
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]-1)]<0){
                dup= Math.abs(nums[i]);           // Here we are doing absolute because of cases that involve duplicates
            }else{
                nums[Math.abs(nums[i]-1)] *=-1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                val= i+1;
                break;
            }
        }
        output[0]=dup;
        output[1]=val;
        System.out.println(Arrays.toString(output));
    }
}
