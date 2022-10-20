package 백준;
import java.util.*;
public class back10886 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[2];
        for(int i=0;i<n;i++){
            int temp=scanner.nextInt();
            arr[temp]++;
        }
        if(arr[0]>arr[1]){
            System.out.println( "Junhee is not cute!");
        }else{
            System.out.println( "Junhee is cute!");
        }
    }
}
