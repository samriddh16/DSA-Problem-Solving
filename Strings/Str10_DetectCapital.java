public class Str10_DetectCapital {
    public static void main(String[] args) {
        String word = "GG";
        int n = word.length();
        int countCap=0, countNcap=0;
        boolean firstCap=false;
        for(int i=0 ; i<n ; i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z')
                countNcap++;

            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                if(i==0){
                    firstCap=true;
                }
                countCap++;
            }
        }
        if(countCap==n || countNcap==n || (firstCap && countNcap==n-1)){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
