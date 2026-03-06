import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array4_ThreeSumClosest {
    public static void main(String[] args) {
            int[] arr = {-1, 2, 1, -4};
            int target = 1;
            int sum;
            int closestsum = Integer.MAX_VALUE;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 2; i++) {
                int k=i+1,l= arr.length-1;

                while(k<l) {
                    sum = arr[l] + arr[k] + arr[i] ;
                    if(Math.abs(target-sum)<Math.abs(target-closestsum))
                        closestsum = sum;
                    if (sum > target)
                        l--;
                    else if (sum < target)
                        k++;
                }
            }
            System.out.println(closestsum);
    }
}
