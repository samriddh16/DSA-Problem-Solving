import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array36_InsertInterval1stApp {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        List<int[]> list = new ArrayList<>();
        list.addAll(Arrays.asList(intervals));
        System.out.println(Arrays.deepToString((list.toArray())));
        int i=0;
        while(i<list.size()){
            if(newInterval[0]>list.get(i)[1])
                i++;
            else if(newInterval[1]<list.get(i)[0]){
                list.add(i,newInterval);
                break;
            }else{
                int val1 = Math.min(newInterval[0],list.get(i)[0]);
                int val2 = Math.max(newInterval[1],list.get(i)[1]);
                list.remove(i);
                newInterval[0]=val1;
                newInterval[1]=val2;
            }
        }
        if(i==list.size()){
            list.add(newInterval);
        }
        int[][] result = list.toArray(new int[list.size()][]);
        intervals = result;
        System.out.println(Arrays.deepToString(intervals));
    }
}
