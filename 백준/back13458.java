package 백준;
import java.util.*;
public class back13458 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long sum=0;
        int []a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        for(int i=0;i<n;i++){
            if(b>=a[i]){
                sum+=1;
            }else{
                sum+=1;
                a[i]-=b;
                if(a[i]%c==0){
                    sum+=a[i]/c;
                }else{
                    sum+=(a[i]/c)+1;
                }
            }
        }
        System.out.println(sum);
    }
}
