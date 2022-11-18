package 백준;
import java.util.*;
public class back1292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int arr[]=new int[1000];
        int count=0;
        int sum=0;
        for(int i=1;i<1001;i++){
            for(int j=0;j<i;j++){
                if(count==1000)
                break;
                arr[count]=i;
                count++;
            }
        }
        for(int i=a-1;i<=b-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
