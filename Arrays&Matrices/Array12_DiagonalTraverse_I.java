import java.util.*;

public class Array12_DiagonalTraverse_I {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(!map.containsKey(i+j)){
                    map.put((i+j),new ArrayList<>());
                    map.get(i+j).add(mat[i][j]);
                }else
                    map.get(i+j).add(mat[i][j]);
            }
        }
        int[] output = new int[mat.length*mat[0].length];
        Set<Integer> set = map.keySet();
        int k=0;
        for (Integer key : set) {
            List<Integer> list = map.get(key);
            if(key%2==1){
                for(int i=0; i<list.size(); i++) {
                    output[k] = list.get(i);
                    k++;
                }
            }else{
                for(int i=list.size()-1 ; i>=0 ; i--) {
                    output[k]=list.get(i);
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
