// First two approach are not very good as we are using deleteCharAt() function which is very costly internally.
// The last approach is very smart one and very good one also.

public class Str7_MakeStringGreat {
    public static void main(String[] args) {
        String s = "leEeetcode";
        StringBuilder sb = new StringBuilder(s);
        int i=0, j=1;
//        while(j<sb.length()){
//            if(i>=0 && (sb.charAt(i)>='a' && sb.charAt(i)<='z') && (sb.charAt(j)>='A' && sb.charAt(j)<='Z') && (sb.charAt(i)==(Character.toLowerCase(sb.charAt(j))))){
//                sb.deleteCharAt(j);
//                sb.deleteCharAt(i);
//                i--;
//                j--;
//                continue;
//            }
//            if(i>=0 && (sb.charAt(i)>='A' && sb.charAt(i)<='Z') && (sb.charAt(j)>='a' && sb.charAt(j)<='z') && (Character.toLowerCase(sb.charAt(i))==sb.charAt(j))){
//                sb.deleteCharAt(j);
//                sb.deleteCharAt(i);
//                i--;
//                j--;
//                continue;
//            }
//            i++;
//            j++;
//        }
//        while(i<sb.length()){
//            if(i>=0 && i<sb.length()-1 && sb.charAt(i)== (sb.charAt(i+1)+32)){
//                sb.deleteCharAt(i+1);
//                sb.deleteCharAt(i);
//                i--;
//                continue;
//            }
//            if(i>=0 && i<sb.length()-1 && (sb.charAt(i)+32)== (sb.charAt(i+1))){
//                sb.deleteCharAt(i+1);
//                sb.deleteCharAt(i);
//                i--;
//                continue;
//            }
//            i++;
//        }
//        System.out.println(sb);

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (result.length() > 0 && (ch + 32 == result.charAt(result.length() - 1) || ch - 32 == result.charAt(result.length() - 1))) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);;
    }
}
