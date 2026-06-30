package Day20;

public class VowelCheck {
    public static void main(String[] args) {
        String str = "manish";
        String str2 = "bdcdfgi";
        System.out.println(isVowelExist(str2));
        System.out.println(isVowelExist(str));

    }
    private static boolean isVowelExist(String val){
        String vowel = "aeiou";
        for(int i =0; i<val.length();i++){
            char c = val.charAt(i);
            if(vowel.contains(""+c)){
                return true;
            }
        }
        return false;
    }
}
