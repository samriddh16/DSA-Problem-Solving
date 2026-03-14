import java.util.HashMap;

public class Array40_SubarrSumsDivByK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0,count=0;
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;        // Here we are converting -ve remainder to +ve remainder
            if(rem<0)                 // because its creates problem in counting of subarray sum
                rem = rem+k;
            if(!map.containsKey(rem)){
                map.put(rem, 1);
            }else{
                count+= map.get(rem);
                map.put(rem, map.getOrDefault(rem, 0) + 1);
            }
        }
        System.out.println(count);
    }
}
