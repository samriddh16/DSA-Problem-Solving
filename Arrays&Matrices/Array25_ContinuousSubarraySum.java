import java.util.HashMap;

public class Array25_ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23,2,10,7};
        int k=10;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0,remainder=0;
        hm.put(0,-1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            remainder=sum%k;
            if(hm.containsKey(remainder)){
                if(i-hm.get(remainder)>=2){
                    System.out.println("True");
                    return;
                }
            }else{
                hm.put(remainder,i);
            }
        }
        System.out.println("False");
    }
}
