package 백준;
import java.util.*;
public class back10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            int temp=scanner.nextInt();
            if(temp<40){
                temp=40;
            }
            sum+=temp;
        }        
        System.out.println(sum/5);
    }
}
