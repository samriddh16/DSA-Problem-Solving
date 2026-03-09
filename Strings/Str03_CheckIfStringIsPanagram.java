public class Str3_CheckIfStringIsPanagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean[] bool = new boolean[26];
        int count=0;
        for(int i=0 ; i<sentence.length() ; i++){
            int idx = sentence.charAt(i) - 'a';
            if(!bool[idx]){
                bool[idx] = true;
                count++;
            }

        }
        if(count==26){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
