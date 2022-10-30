package 백준;
import java.util.*;
public class back2167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[][]=new int[n][m];
        for(int a=0;a<n;a++){
            for(int b=0;b<m;b++ ){
                arr[a][b]=scanner.nextInt();
            }
        }
        int k=scanner.nextInt();
        for(int a=0;a<k;a++){
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int sum=0;
            for(int b=i-1;b<x;b++){
                for(int c=j-1;c<y;c++){
                    sum+=arr[b][c];
                }
            }
            System.out.println(sum);
        }
    }
}
