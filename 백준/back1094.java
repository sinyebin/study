package 백준;
import java.util.*;
public class back1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int temp=64;
        int num=0;
        while(x>0){
            if(temp>x){
                temp/=2;
            }else{
                num++;
                x-=temp;
            }
        }
        System.out.println(num);
    }
}
