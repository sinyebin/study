package 백준;
import java.util.*;
public class back_1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int n=scanner.nextInt();
        int a[]=new int[n];
        Integer b[]=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());
        for(int i=0;i<n;i++){
            sum+=a[i]*b[i];
        }
        System.out.println(sum);
    }
}
