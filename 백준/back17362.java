import java.util.*;
public class back17362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%8==6){
            System.out.println(4);
        }else if(n%8==7){
            System.out.println(3);
        }else if(n%8==0){
            System.out.println(2);
        }else{
            System.out.println(n%8);
        }
    }
}
