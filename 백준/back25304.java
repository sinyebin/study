package 백준;
import java.util.*;
public class back25304 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int money=scanner.nextInt();
        int num=scanner.nextInt();
        int sum=0;
        for(int i=0;i<num;i++){
            int temp=scanner.nextInt();
            int temp2=scanner.nextInt();
            sum+=temp*temp2;
        }
        if(money==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
