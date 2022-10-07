package 백준;
import java.util.*;
public class back11728 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(a[i]<b[j]){
                sb.append(a[i++]+" ");
            }else{
                sb.append(b[j++]+" ");
            }
        }
        while(i<n){
            sb.append(a[i++]+" ");
        }
        while(j<m){
            sb.append(b[j++]+" ");
        }
        System.out.println(sb.toString());
    }
}
