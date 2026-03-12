public class Str14_ReverseEachWordsInString {

    public static String reverseWord(String str, int start, int end) {
        StringBuilder word = new StringBuilder();
        int i = end;
        while(i>=start) {
            word.append(str.charAt(i));
            i--;
        }
        word.append(" ");
        return word.toString();
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        StringBuilder strb = new StringBuilder();
        int i=0, j=i+1;
        while(j<str.length()) {
            if(str.charAt(j)!=' '){
                j++;
                continue;
            }
            strb.append(reverseWord(str, i, j-1));
            i=j+1;
            j=i+1;
        }
            strb.append(reverseWord(str, i, str.length()-1));
            strb.deleteCharAt(strb.length()-1);
        System.out.println(strb);
    }
}
