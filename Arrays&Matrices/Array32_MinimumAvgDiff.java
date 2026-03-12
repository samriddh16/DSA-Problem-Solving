public class Array32_MinimumAvgDiff {
    public static void main(String[] args) {
        int[] nums = {2,5,3,9,5,3};
        int sum= 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int left=0,right=sum,countl=0,countr=nums.length;
        int minDiff = Integer.MAX_VALUE,min_index=-1;

        for(int i=0; i<nums.length; i++){
            right-=nums[i];
            left+=nums[i];
            countl++;
            countr--;
            int leftavg = left/countl;
            int rightavg = countr==0?0: right/countr;
            int diff = Math.abs(leftavg-rightavg);
            if(diff<minDiff){
                minDiff = diff;
                min_index = i;
            }
        }
        System.out.println(min_index);
    }
}
