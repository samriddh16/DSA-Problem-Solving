public class DAC1_MinMaxAlgo {
    public static int dacMin(int[] arr, int l, int r) {
        if(l==r)
            return arr[l];
        int mid = (l+r)/2;
        int n1 = dacMin(arr, l, mid);
        int n2 = dacMin(arr, mid+1, r);
        return Math.min(n1, n2);
    }
    public static int dacMax(int[] arr, int l, int r){
        if(l==r)
            return arr[l];
        int mid = (l+r)/2;
        int n1 = dacMax(arr, l, mid);
        int n2 = dacMax(arr, mid+1, r);
        return Math.max(n1, n2);
    }
    public static void main(String[] args) {
        int[] arr = {7,6,13,3,10,35,23};
        int n = dacMin(arr, 0, arr.length-1);
        System.out.println("Min- "+n);
        int m = dacMax(arr, 0, arr.length-1);
        System.out.println("Max- "+m);
    }
}
