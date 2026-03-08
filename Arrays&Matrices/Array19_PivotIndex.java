public class Array19_PivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,-1,2};
        int left=0,right=0;
        for(int i=0;i<arr.length;i++){
            right+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            right=right-arr[i];
            if(i==0)
                left=0;
            if(i==arr.length-1)
                right=0;
            if(left==right){
                System.out.println("Pivot index is "+i);
                return;
            }
            left=left+arr[i];
        }
        System.out.println("No pivot index found");
    }
}
