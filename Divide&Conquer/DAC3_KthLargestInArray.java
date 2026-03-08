import java.util.Arrays;
// Remember here the 1st approach is also good one but in worst case it goes to O(n^2), so on Leetcode it does not work.
// With Randomized QuickSort it does work a little bit.
// So we have to with second approach here which is using modifying Arrays.sort() with comparator to work with strings.
// Since inbuilt sort in java uses Tim Sort which is optimal one so it gives Beat 95% on Leetcode.
public class DAC3_KthLargestInArray {
    // 1st Approach
    private static int compareNumericStrings(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() - b.length(); // for string with different length - > shorter string = smaller number
        }
        return a.compareTo(b); // same string with same length → lexicographic check
    }
    public static int partition (String[] arr, int l, int r){
        String pivot = arr[r];
        int i = l-1;
        for (int j = l; j < r; j++){
            if (compareNumericStrings(arr[j], pivot) < 0){
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }

    public static String findKthLargest(String[] arr, int k, int l, int r){
        int n = arr.length;
        if(l>r)
            return "";
        int idx = partition(arr, l, r);
        if(n-idx == k)
            return arr[idx];
        else if(n-idx > k){
            return findKthLargest(arr, k, idx+1, r);
        }else{
            return findKthLargest(arr, k, l, idx-1);
        }
    }
    public static void main(String[] args) {
        String[] nums = {"5","2","2","9","7"};
        int k=1;
//        String res = findKthLargest(nums,k,0,nums.length-1);
//        System.out.println(res);

        // 2nd Approach
        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) return b.length() - a.length();
            return b.compareTo(a);
        });
        System.out.println(nums[k - 1]);
    }
}
