import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class z40 {
    public static void main(String[] args){
        Random rand = new Random();
        int N = rand.nextInt(20);
        ArrayList<Integer> arrayList = new ArrayList<>(rand.nextInt(20));
        while (arrayList.size() < N) {
            int i = rand.nextInt(60) - 30;
            if (!arrayList.contains(i)) {
                arrayList.add(i);
            }
        }
        int[] randomArray = arrayList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray) + "\n" + row_ranges(randomArray));
    }
    static String row_ranges(int[] array) {
        StringBuilder stringBox = new StringBuilder();
        int min = array[0];
        int max = array[0];
        for (int i : array){
            if ( max == i ){
                continue;
            }
            if(Math.abs(max-i) > 1){
                if(stringBox.length() > 1){
                    stringBox.append(",");
                }
                stringBox.append(max == min ? min : min + "-" + max);
                min = i;
                max = i;
            } else{
                max = i;
            }
        }
        if (stringBox.length() > 1){
            stringBox.append(",");
        }
        stringBox.append(max == min ? min : min + "-"+max);
        return stringBox.toString();
    }
}