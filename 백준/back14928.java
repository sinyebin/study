package 백준;

import java.util.*;
public class back14928 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n=scanner.next();
        long temp=0;
        for(int i=0;i<n.length();i++){
            temp=(temp*10+(n.charAt(i)-'0'))%20000303;
        }
        System.out.println(temp);
    }
}
