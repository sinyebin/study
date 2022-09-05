package 백준;
import java.util.*;
public class back10768 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int d=scanner.nextInt();
        if(m<2){
            System.out.println("Before");
        }else if(m==2&&d<18){
            System.out.println("Before");
        }else if(m==2&&d==18){
            System.out.println("Special");
        }else{
            System.out.println("After");
        }
    }
}
