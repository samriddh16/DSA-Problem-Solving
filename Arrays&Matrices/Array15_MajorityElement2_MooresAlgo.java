import java.util.ArrayList;
import java.util.List;

public class Array15_MajorityElement2_MooresAlgo {
    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, 2, 2,4,4};
        int element1=Integer.MIN_VALUE, element2=Integer.MIN_VALUE;
        int count1=0,count2=0,element_count1=0,element_count2=0;

        for(int i=0; i<nums.length; i++){
            if(count1==0 && element2!=nums[i]){
                element1=nums[i];
                count1=1;
            }
            else if(count2==0 && element1!=nums[i]){
                element2=nums[i];
                count2=1;
            }
            else if(element1==nums[i])
                count1++;
            else if (element2==nums[i])
                count2++;
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> list1 = new ArrayList<>();
        if(count1>0 || count2>0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==element1)
                    element_count1++;
                if(nums[i]==element2)
                    element_count2++;
            }
            if(element_count1>nums.length/3)
                list1.add(element1);
            if(element_count2>nums.length/3)
                list1.add(element2);
        }else
            System.out.println(-999);

        System.out.println(list1);
    }
}
