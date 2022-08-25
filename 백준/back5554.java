package 백준;

import java.util.*;

public class back5554{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        for(int i=0;i<4;i++){
            num+=scanner.nextInt();
        }
        System.out.println(num/60);
        System.out.println(num%60);
    }
}