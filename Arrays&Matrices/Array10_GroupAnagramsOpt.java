import java.util.*;

// Time Complexity- n*klog(k)
// where n-> array size, k-> string size
public class Array10_GroupAnagramsOpt {

    public static String getWord(String word) {
        char[] arr = new char[26];
        char[] ch = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i]-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int freq = arr[i];
            if (freq > 0) {
               for (int j = 0; j < freq; j++) {
                   sb.append((char)(i+'a'));
               }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s : arr) {
            String key = getWord(s);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(s);
            }else{
                map.get(key).add(s);
            }
        }
        Set<String> set = map.keySet();
        for (String key : set) {
            list.add(map.get(key));
        }
        System.out.println(list);
    }
}
