package 백준;

import java.util.*;
public class back1547 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int b=1;
        for(int i=0;i<m;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x==b){
                b=y;
            }else if(y==b){
                b=x;
            }
        }
        System.out.println(b);
    }
}
