public class BS5_PeakIndexInMountainArray {

    public static int binarySearch(int[] arr, int left, int right){
        int mid = (left + right) / 2;
        if(left==right){
            return mid;
        }
        if (arr[mid] < arr[mid + 1]) {
            return binarySearch(arr, mid + 1, right);
        } else {
            return binarySearch(arr, left, mid);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int idx = binarySearch(arr, 0, arr.length-1);
        System.out.println(idx);
    }
}
