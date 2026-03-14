import java.util.Scanner;

public class Array39_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0,temp = num;
        while(temp>0){
            int rem = temp%10;
            temp = temp/10;
            reverse = rem+reverse*10;
        }
        if(num==reverse){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
