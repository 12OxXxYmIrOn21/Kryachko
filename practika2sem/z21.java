import java.util.Scanner;
public class z21 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        String num = number.nextLine();
        String[] arrayStr = num.split("");
        String str = "";
        for(int i = 0; i < arrayStr.length; i++){
            int val = Integer.parseInt(arrayStr[i]);
            if(arrayStr[i].equals("1")||arrayStr[i].equals("2")||arrayStr[i].equals("3")) {
                val += 6;
                str += val;
            }
            if(arrayStr[i].equals("4")||arrayStr[i].equals("5")||arrayStr[i].equals("6")||arrayStr[i].equals("0")){
                str += val;
            }
            if(arrayStr[i].equals("7")||arrayStr[i].equals("8")||arrayStr[i].equals("9")){
                val -= 6;
                str += val;
            }
        }
        System.out.println(str);
    }

}