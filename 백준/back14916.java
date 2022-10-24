package 백준;
import java.util.*;
public class back14916 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        while(n>0){
            if(n%5==0){
                sum=n/5+sum;
                break;
            }
            n-=2;
            sum++;
        }

        if(n<0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }
    }
}