import java.util.*;

public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Чтобы добавить работника введите 1");
        System.out.println("Чтобы завершить работу введите значение отличное от 0 и 1");
        List<String> listok = new ArrayList<String>();
        var x = in.nextInt();
        int i = 0;
        if (x < 2) {
            if(x==1){
                i++;
                listok.add("true");
            } else {
                listok.add("false");
            }
        }
        while (x < 2){
            x = in.nextInt();
            if (x == 1){
                i++;
                listok.add("true");
            } else {
                listok.add("false");
            }
        }
        int index = listok.size() - 1;
        listok.remove(index);
        System.out.println(listok + "\n" + "Количество работников: " + i);
    }
}