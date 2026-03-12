public class Str13_ReverseWordsInString {
    public static String reverseWord(String str, int start, int end) {
        StringBuilder word = new StringBuilder();
        int i = start;
        while(i<=end) {
            word.append(str.charAt(i));
            i++;
        }
        word.append(" ");
        return word.toString();
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        StringBuilder strb = new StringBuilder();
        int i = 0, j = i + 1;
        while (j < str.length() && i < str.length()) {
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
            j = i + 1;
            while (j < str.length() && str.charAt(j) != ' ') {
                j++;
            }
            if (j >= str.length() || i >= str.length())
                break;
            strb.insert(0, reverseWord(str, i, j - 1));
            i = j + 1;
        }
        if (i < str.length())
            strb.insert(0, reverseWord(str, i, str.length() - 1));
        strb.deleteCharAt(strb.length() - 1);
        System.out.println(strb);
    }
}
