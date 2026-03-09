import java.util.Scanner;

public class Str4_CountAndSay {

    public static String countAndSay(int n){
        if(n == 1){
            return "1";
        }
        String str = countAndSay(n-1);
        String result = "";
        int j=0,count=0;
        while(j< str.length()){
            count=1;
            while(j < str.length()-1 && str.charAt(j) == str.charAt(j+1)){
                count++;
                j++;
            }
           result+= count + "" + str.charAt(j);
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n- ");
        n = sc.nextInt();
        String result = countAndSay(n);
        System.out.println(result);
    }
}
