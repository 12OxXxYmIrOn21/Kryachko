public class z4 {
    public static void main(String[] args){
        int cn = str_count("Hello", 'o');
        int cn1 = str_count("Hello", 'l');
        int cn2 = str_count("", 'z');
        System.out.println(cn + "\n" + cn1 + "\n" + cn2);
    }
    public static int str_count(String str, char letter){
        int count = 0;
        for(int n = 0; n < str.length(); n++){
            char x = str.charAt(n);
            if(x == letter) {
                count++;
            }
        }
        return count;
    }
}