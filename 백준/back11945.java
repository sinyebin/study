package 백준;
import java.util.*;
public class back11945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        for(int i=0;i<a;i++){
            while(scanner.hasNext()) {
                StringBuilder sb = new StringBuilder(scanner.next());
    	        System.out.println(sb.reverse());
            }
        }
    }
}
