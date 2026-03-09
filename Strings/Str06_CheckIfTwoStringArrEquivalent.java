public class Str6_CheckIfTwoStringArrEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc","d","defg"};
        String[] word2 = {"abcddefg"};
        int m = word1.length;
        int n = word2.length;
        int w1=0, w2=0,i=0,j=0;
        while(w1<m && w2<n) {
            if(word1[w1].charAt(i)!=word2[w2].charAt(j)) {
                System.out.println(false);
                return;
            }
            i++;
            j++;
            if(i==word1[w1].length()){
                w1++;
                i=0;
            }
            if(j==word2[w2].length()) {
                w2++;
                j = 0;
            }
        }

        if(w2!=word2.length || j!= word2[w2-1].length()){
            System.out.println(false);
            return;
        }
        if(w1!=word1.length || i!= word1[w1-1].length()) {
            System.out.println(false);
            return;
        }

        System.out.println(true);
    }
}
