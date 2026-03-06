import java.util.*;

// Time Complexity- n*klog(k)
// where n-> array size, k-> string size
public class Array10_GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"bAt", "Tab", "tAb"};
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : arr) {
            char[] chararray = s.toLowerCase().toCharArray();
            Arrays.sort(chararray);
            String sorted = new String(chararray);
            if(!(map.containsKey(sorted))) {
                map.put(sorted,new ArrayList<>());
                map.get(sorted).add(s);
            }else {
                map.get(sorted).add(s);
            }
        }
        Set<String> set = map.keySet();
        for(String s : set) {
            list.add(map.get(s));
        }
        System.out.println(list);
    }
}
