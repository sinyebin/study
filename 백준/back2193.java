package 백준;
import java.util.*;
public class back2193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long d[]=new long[n+1];
        d[0]=0;
        d[1]=1;
        for(int i=2;i<n+1;i++){
            d[i]=d[i-1]+d[i-2];
        }
        System.out.println(d[n]);
    }
}
