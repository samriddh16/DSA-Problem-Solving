import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array36_InsertInterval2ndApp {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        List<int[]> list = new ArrayList<>();
        int i=0;
        while(i<intervals.length){
            if(newInterval[0]>intervals[i][1]){
                list.add(intervals[i]);
                i++;
            }
            else if(newInterval[1]<intervals[i][0]){
                break;
            }else{
                newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
                i++;
            }
        }
        list.add(newInterval);
        while(i<intervals.length){
            list.add(intervals[i]);
            i++;
        }
        int[][] result = list.toArray(new int[list.size()][]);
        System.out.println(Arrays.deepToString(result));
    }
}
