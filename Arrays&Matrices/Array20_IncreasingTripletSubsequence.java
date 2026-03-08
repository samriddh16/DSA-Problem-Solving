import java.util.Set;

public class Array20_IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 0, 4, 6};
        int num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE, num3 = 0;
        for (int i = 0; i < nums.length; i++) {
            num3 = nums[i];
            if (num3 <= num1)
                num1 = num3;
            else if (num3 <= num2)
                num2 = num3;
            else {
                System.out.println("Triplet Subsequence found");
                return;
            }
        }
        System.out.println("Triplet Subsequence not found");
    }
}
