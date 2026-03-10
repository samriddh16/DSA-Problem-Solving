import java.util.Arrays;

public class Str11_DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";
        int[] frq1 = new int[26];
        int[] frq2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            frq1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            frq2[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < frq1.length; i++) {
            if((frq1[i]!=0 && frq2[i]==0) || (frq1[i]==0 && frq2[i]!=0)) {
                System.out.println(false);
                return;
            }
        }
        Arrays.sort(frq1);
        Arrays.sort(frq2);
        for(int i = 0; i < frq1.length; i++) {
            if(frq1[i] != frq2[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
