package 백준;
import java.util.*;
public class back4101 {
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        while(a!=0&&b!=0){
            if(a>b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            a= scanner.nextInt();
            b=scanner.nextInt();
        }
    }
}
