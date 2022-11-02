package 백준;
import java.util.*;
public class back2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean arr[][]=new boolean[100][100];
        int n=scanner.nextInt();
        int size=0;
        for(int i=0;i<n;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    arr[j][k]=true;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==true){
                    size++;
                }
            }
        }
        System.out.println(size);
    }
}
