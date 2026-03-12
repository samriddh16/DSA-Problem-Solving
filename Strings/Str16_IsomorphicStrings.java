import java.util.Arrays;

public class Str16_IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper";
        String t = "tiple";

        char[] arr = new char[128];
        for(int i = 0; i < s.length(); i++) {
            if((int)(arr[s.charAt(i)])==0){
                arr[s.charAt(i)] = t.charAt(i);
            }else if(arr[s.charAt(i)]!=t.charAt(i)) {
                System.out.println(false);
                return;
            }
       }
        Arrays.fill(arr, '\0');
        for(int i = 0; i < t.length(); i++) {
            if((int)(arr[t.charAt(i)])==0){
                arr[t.charAt(i)] = s.charAt(i);
            }else if(arr[t.charAt(i)]!=s.charAt(i)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
