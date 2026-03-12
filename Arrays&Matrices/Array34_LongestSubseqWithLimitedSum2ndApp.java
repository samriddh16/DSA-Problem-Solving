import java.util.Arrays;

public class Array34_LongestSubseqWithLimitedSum2ndApp {

    public static int binarySearch(int[] arr, int n, int key) {
        int l=0,r=n-1;
        int mid=0;
        int index=-1;
        while(l<=r) {
            mid=(l+r)/2;
            if(arr[mid]<=key) {
                index=mid;
                l=mid+1;
            }else
               r=mid-1;
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] output = new int[queries.length];
        int sum=0;
        int[] cumsum = new int[nums.length];
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            sum+=nums[i];
            cumsum[i]=sum;
        }
        for(int i = 0; i < queries.length; i++){
            int count= binarySearch(cumsum,n,queries[i]);
            output[i]=count;
        }
        System.out.println(Arrays.toString(output));
    }
}
