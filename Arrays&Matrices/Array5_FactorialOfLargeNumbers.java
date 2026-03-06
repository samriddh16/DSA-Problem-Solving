import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array5_FactorialOfLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[10000];
        arr[0] = 1;
        int size=1,result=0,carry=0;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < size; j++){
                result=i*arr[j]+carry;
                carry=result/10;
                arr[j]=result%10;
            }
            while(carry>0){
                arr[size]=carry%10;
                size++;
                carry=carry/10;
            }
        }
        for(int i = size-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}
