package 백준;
import java.util.*;
public class back1463 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        System.out.println(make(x,0));
    }
    static int make(int x, int count){
        if(x<2){
            return count;
        }
        return Math.min(make(x/2,count+1+(x%2)),make(x/3,count+1+(x%3)));
    }
}
