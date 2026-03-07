public class Array14_MajorityElement1_MooresAlgo {
    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, 2, 2};
        int element=nums[0];
        int count=0,element_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element)
                count++;
            else
                count--;
            if(count==0)
                element=nums[i+1];
        }
        if(count>0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==element)
                    element_count++;
            }
            if(element_count>nums.length/2)
                System.out.println(element);
            else
                System.out.println(-999);
        }else
            System.out.println(-999);
    }
}
