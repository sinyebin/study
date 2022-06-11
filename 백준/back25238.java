package 백준;
import java.util.*;
public class back25238 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        double num=num1-num1*num2*0.01;
        if(num>=100){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
