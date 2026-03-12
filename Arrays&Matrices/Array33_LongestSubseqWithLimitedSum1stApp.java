import java.util.Arrays;

public class Array33_LongestSubseqWithLimitedSum1stApp {
    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] output = new int[queries.length];
        int sum=0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++) {
            sum=0;
            for (int j = 0 ; j < n; j++) {
                sum += nums[j];
                if (sum > queries[i]) {
                    output[i]=j;
                    break;
                }
                if(j==n-1){
                    output[i]=n;
                }
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
