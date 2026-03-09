public class BS2_SearchInRotatedSortedArr_II {

    public static int findPivot(int[] nums, int left, int right) {
        while (left < right) {    // If we do not take this condition less than condition then loop may become infinite loop
            while(left<right && nums[left]==nums[left+1]) {
                left++;
            }
            while(left<right && nums[right]==nums[right-1]) {
                right--;
            }
            int mid = left + (right - left) / 2;
            if(nums[mid]>nums[right]){
               left = mid + 1;
            }else{
                right = mid;
            }
        }
       return right;
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        while(left<=right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]>target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = findPivot(nums, 0, nums.length - 1);
        int idx1 = binarySearch(nums, 0, pivot-1, target);
        if(idx1!=-1){
            System.out.println(idx1);
            return;
        }
        int idx2 = binarySearch(nums,pivot,nums.length-1, target);
        System.out.println(idx2);
    }
}
