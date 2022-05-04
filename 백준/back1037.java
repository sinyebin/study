package 백준;
import java.util.*;
public class back1037 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int answer=arr[0]*arr[num-1];
        System.out.println(answer);
    }
}
