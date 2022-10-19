package 백준;
import java.util.*;
public class back17256 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int c[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<3;i++){
            c[i]=scanner.nextInt();
        }
        b[0]=c[0]-a[2];
        b[1]=c[1]/a[1];
        b[2]=c[2]-a[0];
        for(int i=0;i<3;i++){
            System.out.print(b[i]+" ");
        }
    }
}
