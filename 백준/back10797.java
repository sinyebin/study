package 백준;
import java.util.*;
public class back10797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int ans=0;
        for(int i=0;i<5;i++){
            int temp=scanner.nextInt();
            if(num==temp){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
