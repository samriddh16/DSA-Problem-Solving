import java.util.Arrays;
import java.util.Scanner;

public class Array6_NextPermutation {

    public static void reverse(int i, int j, int[] arr) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,2,1};
        int n = arr.length;
        int index=-1;
        int swap_index=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                index=i-1;
                break;
            }
        }
        if(index!=-1){
            for(int i=n-1; i>index;i--){
                if(arr[i]>arr[index]){
                    swap_index=i;
                    break;
                }
            }
            int temp=arr[index];
            arr[index]=arr[swap_index];
            arr[swap_index]=temp;
        }
        reverse(index+1,n-1,arr);
        System.out.println(Arrays.toString(arr));
    }
}
