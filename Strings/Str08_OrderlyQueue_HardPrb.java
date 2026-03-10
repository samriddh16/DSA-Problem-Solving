import java.util.Arrays;

public class Str8_OrderlyQueue_HardPrb {
    public static void main(String[] args) {
        String s = "ceabd";
        int k=1;
        String result=s;
        if(k>1){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            result = new String(arr);
        }else{
            for(int i=1 ; i<s.length() ; i++){
                String temp = s.substring(i) + s.substring(0,i);
                // Here compareTo will compare them lexicographically
                result = result.compareTo(temp)>0?result:temp;
            }
        }
        System.out.println(result);
    }
}
