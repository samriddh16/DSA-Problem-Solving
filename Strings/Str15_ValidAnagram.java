import java.util.Arrays;
import java.util.HashMap;

public class Str15_ValidAnagram {
    public static void main(String[] args) {
        String word1 = "anagram";
        String word2 = "nagaram";
        int m = word1.length();
        int n = word2.length();
        if(m!=n){
            System.out.println(false);
            return;
        }
//        char[] arr1 = word1.toCharArray();
//        char[] arr2 = word2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        for(int i=0; i<m; i++){
//            if(arr1[i]!=arr2[i]){
//                System.out.println(false);
//                return;
//            }
//        }
//        System.out.println(true);
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : word1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c : word2.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
            }
        }
        for(int i : map.values()){
            if(i!=0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
