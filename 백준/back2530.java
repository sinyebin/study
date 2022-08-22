package 백준;
import java.util.*;
public class back2530 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour=scanner.nextInt();
        int min=scanner.nextInt();
        int sec = scanner.nextInt();
        int num=scanner.nextInt();
        sec+=num;
        min+=sec/60;
        sec%=60;
        hour+=min/60;
        min%=60;
        hour%=24;
        System.out.println(hour+" "+min+" "+sec);
    }
}
