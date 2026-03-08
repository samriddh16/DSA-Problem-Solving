import java.util.Arrays;

public class Array21_LargestPerimeter {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Arrays.sort(nums);
        for (int i = nums.length-3 ; i>=0 ; i--) {
            if(nums[i]+nums[i+1]>nums[i+2]) {
                System.out.println("Largest Perimeter- "+(nums[i]+nums[i+1]+nums[i+2]));
                return;
            }
        }
        System.out.println("Largest Perimeter- 0");
    }
}
