package 백준;
import java.util.*;
public class back1934 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int gcd=gcd(a,b);
            System.out.println(a*b/gcd);
        }
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}
