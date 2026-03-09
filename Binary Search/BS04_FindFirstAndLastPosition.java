import java.util.Arrays;

public class BS3_FindFirstAndLastPosition {

    public static int leftMostIdx(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int left_idx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                left_idx = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left_idx;
    }

    public static int rightMostIdx(int[] arr, int target){
        int left = 0, right = arr.length - 1;
        int right_idx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
               right_idx = mid;
               left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return right_idx;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = new int[2];

        int leftMostIdx = leftMostIdx(nums, target);
        int rightMostIdx = rightMostIdx(nums, target);
        result[0] = leftMostIdx;
        result[1] = rightMostIdx;
        System.out.println(Arrays.toString(result));
    }
}
