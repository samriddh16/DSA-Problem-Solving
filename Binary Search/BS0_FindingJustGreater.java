public class BS0_FindingJustGreater {
    public static int findingJustGreater(int[] arr, int left , int right, int target) {
        if(left== right) {
            if (arr[left] > target) {
                return arr[left];
            }
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(arr[mid]> target){
            return findingJustGreater(arr, left, mid, target);
        }else{
            return findingJustGreater(arr, mid + 1, right, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,9};
        int target = 4;
        int result = findingJustGreater(arr, 0, arr.length-1, target);
        System.out.println(result);
    }
}
