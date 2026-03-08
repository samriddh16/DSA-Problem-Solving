import java.util.Arrays;
import java.util.HashMap;

public class Array22_ContainsDuplicate1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            if(map.containsKey(nums[i])){
//                System.out.println("True");
//                return;
//            }
//            map.put(nums[i], i);
//        }
//        System.out.println("False");
    }
}
