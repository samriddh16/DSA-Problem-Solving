import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array3_ThreeSum {

    public static void twoSum(int target, int[] arr, int m, List<List<Integer>> list, int element){
        int k=m,l= arr.length-1;
        while(k<l){
            if(arr[k]+arr[l]>target)
                l--;
            else if(arr[k]+arr[l]<target)
                k++;
            else{
                while(k<l && arr[k]==arr[k+1])
                    k++;
                while(k<l && arr[l]==arr[l-1])
                    l--;
                list.add(Arrays.asList(element, arr[k], arr[l]));
                k++;
                l--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1000,-500,0,500,1000};
        int target = 300;

        if(arr.length<3){
            System.out.println("Invalid input. Require at least 3 elements");
        }
        else {
            Arrays.sort(arr);
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < arr.length - 2; i++) {
                if (i != 0 && arr[i] == arr[i - 1]) {
                    continue;
                }

                int target1 = target - arr[i];
                twoSum(target1, arr, i + 1, list, arr[i]);
            }
            System.out.println(list.toString());
        }
    }
}
