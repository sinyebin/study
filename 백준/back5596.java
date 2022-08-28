package 백준;
import java.util.*;
public class back5596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        int b=0;
        for(int i=0;i<4;i++){
            a+=scanner.nextInt();
        }
        for(int i=0;i<4;i++){
            b+=scanner.nextInt();
        }
        System.out.println(Math.max(a, b));
    }
}
