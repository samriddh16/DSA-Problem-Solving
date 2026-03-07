import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;

public class Array1_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[2];
        System.out.println("Enter the number of elements in the array- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The two sum is: ");
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = target-arr[i];
            if (map.containsKey(diff)) {
                ans[0]= map.get(diff);
                ans[1]= i;
                System.out.println(Arrays.toString(ans));
            }else{
                map.put(arr[i], i);
            }
        }
    }
}
