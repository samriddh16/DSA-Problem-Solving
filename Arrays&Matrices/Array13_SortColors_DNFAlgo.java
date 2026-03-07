import java.util.Arrays;

public class Array13_SortColors_DNFAlgo {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int i=0,j=0,k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            } else if (nums[j]==2) {
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                k--;
            }else{
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
