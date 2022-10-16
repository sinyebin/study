package 백준;
import java.util.*;
public class back5585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m=1000-scanner.nextInt();
        int tot=0;
        
        tot+=m/500;
        m%=500;
               
        tot+=m/100;
        m%=100;
        
        tot+=m/50;
        m%=50;

        tot+=m/10;
        m%=10;

        tot+=m/5;
        m%=5;

        tot+=m;

        System.out.println(tot);
    }
}
