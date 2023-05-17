import java.math.BigInteger;
import java.util.*;

public class z31 {

    public static void main(String[] args){
        fibonacci(100);
    }
    public static void fibonacci(int x){
        if( 10 <= x && x <= 100000){
            BigInteger bInt = BigInteger.ONE;
            BigInteger bInt2 = BigInteger.ONE;
            BigInteger num = BigInteger.ONE;
            for (int i = 2; i < x;i++) {
                num = bInt.add(bInt2);
                bInt2 = bInt;
                bInt = num;
            }
            System.out.println(bInt);
            int[] intTab = String.valueOf(bInt).chars().map(Character::getNumericValue).toArray();
            HashMap<Integer, Integer> counting = new HashMap<>();
            for(int j : intTab) {
                if (counting.containsKey(j)){
                    counting.put(j, counting.get(j) + 1);
                }else{
                    counting.put(j, 1);
                }
            }
            int mKey = 0;
            int mVal = 0;
            for (Map.Entry<Integer, Integer> couples : counting.entrySet()) {
                if(couples.getValue() > mVal){
                    mVal = couples.getValue();
                }
                if(couples.getValue() == mVal){
                    mKey = couples.getKey();
                }
            }
            System.out.println(mKey + " " + mVal);
        }
    }
}