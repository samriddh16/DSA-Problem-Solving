import java.util.Arrays;
import java.util.HashMap;

public class Array16_OriginalArrFromDoubledArr {
    public static void main(String[] args) {
        int[] changed = {1,1,1,1};
        int[] output = new int[changed.length/2];
        int k=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(changed);
        if(changed.length%2 == 0){
            for (int i = 0; i < changed.length; i++) {
                map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
            }
            for (int i = 0; i < changed.length; i++) {
                if(map.get(changed[i]) == 0)
                    continue;
                if (map.containsKey(0) && map.get(0) % 2 != 0) {
                    System.out.println("Not a doubled array");
                    return;
                }
                if(map.containsKey(changed[i]*2) && map.get(changed[i]*2)!=0) {
                    map.put(changed[i], map.get(changed[i])-1);
                    map.put(changed[i]*2, map.get(changed[i]*2)-1);
                    output[k] = changed[i];
                    k++;
                }else{
                    System.out.println("Not a doubled array");
                    return;
                }
            }
        }else{
            System.out.println("Not a doubled array");
        }
        System.out.println(Arrays.toString(output));
    }
}
