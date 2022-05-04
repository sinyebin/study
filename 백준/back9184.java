package 백준;
import java.util.*;
public class back9184 {
    static int dp[][][]=new int[21][21][21];
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        while(num1!=-1||num2!=-1||num3!=-1){
            System.out.println("w("+num1+", "+num2+", "+num3+") = "+w(num1,num2,num3));
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            num3=scanner.nextInt();
        }
    }
    public static int w(int num1, int num2, int num3){
        if(num1<=0||num2<=0||num3<=0){
            return 1;
        }
        if(num1>20||num2>20||num3>20){
            return dp[20][20][20]=w(20,20,20);
        }
        if(dp[num1][num2][num3]!=0){
            return dp[num1][num2][num3];
        }
        if(num1 < num2 && num2 < num3) {
			return dp[num1][num2][num3] = w(num1, num2, num3 - 1) + w(num1, num2 - 1, num3 - 1) - w(num1, num2 - 1, num3);
		}
        return dp[num1][num2][num3]= w(num1 - 1, num2, num3) + w(num1 - 1, num2 - 1, num3) + w(num1 - 1, num2, num3 - 1) - w(num1 - 1, num2 - 1, num3 - 1);
    }
}
