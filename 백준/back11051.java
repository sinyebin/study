package 백준;
import java.util.*;
public class back11051 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int [][]arr=new int[a+1][a+1];
        for(int i=0;i<a+1;i++){
            for(int j=0;j<=i;j++){
                if(i==j||j==0){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=(arr[i-1][j-1]+arr[i-1][j])%10007;
                }
            }
        }
        System.out.println(arr[a][b]);
    }
}
