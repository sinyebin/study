package 백준;

import java.util.*;
public class back10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[26];
        String str =scanner.nextLine();
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-97]++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
