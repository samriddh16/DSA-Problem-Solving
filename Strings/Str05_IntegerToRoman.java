import java.util.ArrayList;

public class Str5_IntegerToRoman {
    public static void main(String[] args){
        int num= 3749;
        StringBuilder roman = new StringBuilder();
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int count = 0,i=0;
        while(num>0){
            for(i=0 ; i<value.length ; i++){
                if(num>=value[i]){
                    count = num/value[i];
                    num = num%value[i];
                    break;
                }
            }
            for(int j=0 ; j<count; j++){
                roman.append(symbol[i]);
            }
        }
        System.out.println(roman);
    }
}
