package 백준;
import java.util.*;
public class back1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] months={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days={"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int m=scanner.nextInt();
        int d=scanner.nextInt();
        int n=0;
        for(int i=0;i<m;i++){
            n+=months[i];
        }
        n+=d-1;
        System.out.println(days[n%7]);
    }
}
