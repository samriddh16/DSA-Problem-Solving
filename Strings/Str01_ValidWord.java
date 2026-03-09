public class Str1_ValidWord {
    public static void main(String[] args) {
        String str = "234Adas";
        String st = str.toLowerCase();
        int vCount = 0,cCount = 0;
        char[] str1 = st.toCharArray();
        if(str.length()<3){
            System.out.println("False");
            return;
        }

        for (int i = 0; i < str1.length; i++) {
            if(Character.isLetter(str1[i])){
                if(str1[i]=='a' || str1[i]=='e' || str1[i]=='i' || str1[i]=='o' || str1[i]=='u'){
                    vCount++;
                }else
                    cCount++;
            }
            else if(!Character.isDigit(str1[i])){
                System.out.println("False");
                return;
            }
        }
        if(vCount>0 && cCount>0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
