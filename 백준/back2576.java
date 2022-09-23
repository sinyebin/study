package 백준;
import java.util.*;
public class back2576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int min=101;
        for(int i=0;i<7;i++){
            int temp= scanner.nextInt();
            if(temp%2==1){
                sum+=temp;
                min=Math.min(min,temp);
            }
        }
        if(sum>0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}
