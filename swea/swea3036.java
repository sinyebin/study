package swea;

import java.util.Scanner;

public class swea3036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fRing=scanner.nextInt();
        for(int i=1;i<n;i++){
            int oRing = scanner.nextInt();
            int gcd = gcd(fRing,oRing);
            System.out.println((fRing/gcd)+"/"+(oRing/gcd));
        }
    }
    static int gcd(int a, int b){
        int r;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
