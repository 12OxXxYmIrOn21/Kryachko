import java.util.LinkedHashSet;

public class z15 {
    public static void main(String[] args){
        String stroka1 = line("abc abc ab abc ab acs acs");
        System.out.println(stroka1);
    }
    public static String line(String stroka1){
        String str="";
        String[] arr=stroka1.split(" ");
        LinkedHashSet<String> spisok = new LinkedHashSet<String>();
        for (int i = 0; i < arr.length; i++) {
            spisok.add(arr[i]);
        }
        for(String s:spisok){
            str=str+s+" ";
        }
        return str;
    }
}