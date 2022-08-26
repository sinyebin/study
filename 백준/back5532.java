package 백준;
import java.util.*;
public class back5532 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        if(a%c==0){
            a/=c;
        }else{
            a=a/c+1;
        }
        if(b%d==0){
            b/=d;
        }else{
            b=b/d+1;
        }
        System.out.println(Math.min(l-a,l-b));
    }
}
