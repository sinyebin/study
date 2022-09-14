package 백준;
import java.util.*;
public class back2446 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=n-1;i>0;i--){
            for(int j=i;j<n-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
