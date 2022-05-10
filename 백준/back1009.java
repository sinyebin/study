package 백준;
import java.util.*;
public class back1009 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if(a % 10 == 0) {
				a = 10;
			}else if(a > 10){
				a = a % 10;
			}
            if(a == 1 || a == 5 || a == 6 || a == 10) {
				System.out.println(a);
			}else if(a == 4 || a == 9) {
				if(b % 2 == 0) {
					System.out.println((int) ((a * a) % 10));
				}else {
					System.out.println(a);
				}
			}else {
				b %= 4;
				if(b == 0) {
					b = 4;
				}
                System.out.println((int) (Math.pow(a, b) % 10));
			}
        }
    }
}
