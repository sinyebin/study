package swea;
import java.util.Scanner;
public class swea2058 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int result=0;
        while(T!=0){
            result+=T%10;
            T/=10;
        }
        System.out.println(result);
    }
}
