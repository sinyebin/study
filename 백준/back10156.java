package 백준;

import java.util.*;
public class back10156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int temp=a*b-c;
        if(temp>0){
            System.out.println(temp);
        }else{
            System.out.println(0);
        }
    }
}
