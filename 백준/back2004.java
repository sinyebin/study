package 백준;
import java.util.*;
public class back2004 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        long num1=scanner.nextLong();
        long num2=scanner.nextLong();
        long count5=count_five(num1)-count_five(num1-num2)-count_five(num2);
        long count2=count_two(num1)-count_two(num1-num2)-count_two(num2);
        System.out.println(Math.min(count5, count2));
    }
    static long count_five(long num){
        int count=0;
        while(num>=5){
            count+=num/5;
            num/=5;
        }
        return count;
    }
    static long count_two(long num){
        int count=0;
        while(num>=2){
            count+=num/2;
            num/=2;
        }
        return count;
    }
}
