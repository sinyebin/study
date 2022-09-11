package 백준;
import java.util.*;
public class back2441 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
