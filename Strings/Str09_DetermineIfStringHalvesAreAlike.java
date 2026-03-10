public class Str9_DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        String str = s.toLowerCase();
        int mid = str.length()/2;
        int i=0 , j=mid, countL=0, countR=0;
        while(i<=mid-1 && j<str.length()){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                countL++;
            }
            if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u'){
                countR++;
            }
            i++;
            j++;
        }
        if(countL==countR){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
