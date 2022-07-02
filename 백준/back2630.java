package 백준;
import java.util.*;
public class back2630 {
    static int white=0;
    static int blue=0;
    static int arr[][];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        div(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }
    static void div(int r,int c,int size){
        if(check(r,c,size)){
            if(arr[r][c]==0){
                white++;
            }else{
                blue++;
            }
            return;
        }
        int new_size=size/2;
        div(r,c,new_size);
        div(r,c+new_size,new_size);
        div(r+new_size,c,new_size);
        div(r+new_size,c+new_size,new_size);
    }
    static boolean check(int r, int c, int size){
        int temp=arr[r][c];
        for(int i=r;i<r+size;i++){
            for(int j=c;j<c+size;j++){
                if(arr[i][j]!=temp){
                    return false;
                }
            }
        }
        return true;
    }
}
