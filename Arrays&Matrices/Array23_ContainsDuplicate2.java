import java.util.Arrays;
import java.util.HashMap;

public class Array23_ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k=2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i)<=k){
                    System.out.println("True");
                    return;
                }
                map.put(nums[i],i);
            }else{
                map.put(nums[i],i);
            }
        }
        System.out.println("False");
    }
}
