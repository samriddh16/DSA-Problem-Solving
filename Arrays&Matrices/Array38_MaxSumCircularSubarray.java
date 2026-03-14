public class Array38_MaxSumCircularSubarray {

    public static int maxSubArray(int[] nums) {
        int sum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }

    public static int minSubarray(int[] nums) {
        int sum=0,minSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            minSum=Math.min(minSum,sum);
            if(sum>0)
                sum=0;
        }
        return minSum;
    }
    public static void main(String[] args) {
        int[] nums = {1,-2,3,-2};
        int sum=0,maxSum=0,minSum=0,circularSum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        maxSum=maxSubArray(nums);
        minSum=minSubarray(nums);
        circularSum=sum-minSum;
        if(maxSum>0){
            System.out.println(Math.max(maxSum,circularSum));
            return;
        }
        // Here we are directly returning the maxSum if it is negative because if it is negative then
        // the whole array is a minSum array so in that case if we do (circularSum=sum-minSum) then
        // it will result in 0 as the sum(of whole array) and the minSum(again whole array) will be 0
        // so max of both will be zero and that will be a wrong answer
        System.out.println(maxSum);
    }
}
