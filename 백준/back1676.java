package 백준;
import java.util.*;
public class back1676 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        while(num>=5){
            count+=num/5;
            num/=5;
        }
        System.out.println(count);
    }
}
