package 백준;
import java.util.*;
public class back2609 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int result=gcd(num1,num2);
        System.out.println(result);
        System.out.println(num1*num2/result);
    }
    public static int gcd(int num1, int num2){
        while(num2!=0){
            int r=num1%num2;
            num1=num2;
            num2=r;
        }
        return num1;
    }
}
