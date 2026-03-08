// Time Complexity - O(log(n))
public class DAC2_PowerOfElement {
    public static double powerOfElement(double n, int p) {
        if(p==1)
            return n;
        double num = powerOfElement(n,p/2);
        return num*num;
    }
    public static void main(String[] args) {
        double n=3;
        int p=8;
        double result = powerOfElement(n,p);
        System.out.println(result);
    }
}
