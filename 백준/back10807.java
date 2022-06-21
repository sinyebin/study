package 백준;
import java.util.*;
public class back10807 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int arr[]=new int[num];
        int ans=0;
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        int a=scanner.nextInt();
        for(int i=0;i<num;i++){
            if(arr[i]==a){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
