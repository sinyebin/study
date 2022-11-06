package 백준;

import java.util.*;
public class back2566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r=0;
        int c=0;
        int max=0;
        int arr[][]=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j]=scanner.nextInt();
                if(arr[i][j]>max){
                    max=arr[i][j];
                    r=i;
                    c=j;
                }
            }
        }
        System.out.println(max);
        System.out.println((r+1)+" "+(c+1));
    }
}
