import java.util.Random;
public class z22 {
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(9) + 1;
        int y = rand.nextInt(9) + 1;
        int z = rand.nextInt(9) + 1;
        if((x+y)>z && (y+z)>x && (x+z)>y){
            double square = square(x,y,z);
            System.out.println(square);
        }
    }
    public static double square(double x,double y,double z){
        double p = (x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
}
