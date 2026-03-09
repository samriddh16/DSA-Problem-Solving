import java.util.Arrays;

public class Str2_StringComnpression {
    public static void main(String[] args) {
        char[] str = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int l=-1, j=0;
        while(j<str.length) {
            int count=1;
            while(j<str.length-1 && str[j]==str[j+1]){
                j++;
                count++;
            }
            str[++l] = str[j];
            if(count>1){
                String stcount = count+"";
                for(int k=0;k<stcount.length();k++){
                    str[++l] = stcount.charAt(k);
                }
            }
            j++;
        }
        System.out.println(Arrays.toString(str));
        System.out.println(l+1);
    }
}
