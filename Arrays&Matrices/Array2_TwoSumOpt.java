import java.util.Scanner;

public class Array2_TwoSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element- ");
        int target = sc.nextInt();
        System.out.println("The two sum is ");
        int k=0,l=n-1;
        while(k<l){
            if(arr[k]+arr[l]>target)
                l--;
            else if(arr[k]+arr[l]<target)
                k++;
            else {
                System.out.println("("+(1+k)+","+(1+l)+")");
                break;
            }
        }
    }
}
