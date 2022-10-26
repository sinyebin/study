package 백준;
import java.util.*;
public class back5717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m=scanner.nextInt();
        int f=scanner.nextInt();
        while(m!=0&&f!=0){
            System.out.println(m+f);
            m=scanner.nextInt();
            f=scanner.nextInt();
        }
    }
}
