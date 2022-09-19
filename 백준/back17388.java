package 백준;
import java.util.*;
public class back17388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[3];
        int num=0;
        for(int i=0;i<3;i++){
            arr[i]=scanner.nextInt();
            num+=arr[i];
        }
        if(num>=100){
            System.out.println("OK");
        }else if(arr[0]<arr[1]&&arr[0]<arr[2]){
            System.out.println("Soongsil");
        }else if(arr[1]<arr[0]&&arr[1]<arr[2]){
            System.out.println("Korea");
        }else if(arr[2]<arr[0]&&arr[2]<arr[1]){
            System.out.println("Hanyang");
        }
    }
}
