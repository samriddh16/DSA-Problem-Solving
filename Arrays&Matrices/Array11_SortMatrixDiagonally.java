import java.util.*;

public class Array11_SortMatrixDiagonally {
    public static void main(String[] args) {
        int[][] matrix= {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(!map.containsKey(i-j)){
                    map.put((i-j),new ArrayList<>());
                    map.get(i-j).add(matrix[i][j]);
                }else
                    map.get(i-j).add(matrix[i][j]);
            }
        }
        System.out.println("----------------------");
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            Collections.sort(map.get(i));
        }
        for (int i = matrix.length-1 ; i >= 0 ; i--) {
            for (int j =  matrix[i].length-1 ; j >= 0 ; j--) {
               List<Integer> list = map.get(i-j);
               matrix[i][j]=list.get(list.size()-1);
               list.remove(list.size()-1);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
