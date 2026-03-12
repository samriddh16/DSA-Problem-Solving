import java.util.Arrays;

public class Array35_MinimumArrowsToBurstBallons {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        int n = points.length;
        int m = points[0].length;
        int prev[] = points[0];
        int curr[] = new int[2];
        int count=1;
        int prevStart = 0, prevEnd = 0, currStart = 0, currEnd = 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 1; i < n; i++) {
            prevStart = prev[0];
            prevEnd = prev[1];
            curr = points[i];
            currStart = curr[0];
            currEnd = curr[1];
            if(currStart>prevEnd){
                prev = points[i];
                count++;
            }else{
                prev[0] = Math.max(prevStart, currStart);
                prev[1] = Math.min(prevEnd, currEnd);
            }
        }
        System.out.println(count);
    }
}
