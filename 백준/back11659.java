package 백준;
import java.util.*;
public class back11659 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++){
            int x=scanner.nextInt();
            arr[i]=arr[i-1]+x;
        }
        for(int i=0;i<m;i++){
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            System.out.println(arr[num2]-arr[num1-1]);
        }
    }
}
