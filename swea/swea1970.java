package swea;
import java.util.Scanner;
public class swea1970 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			System.out.println("#"+test_case);
            int num=sc.nextInt();
            System.out.print(num/50000+" ");
            num%=50000;
            System.out.print(num/10000+" ");
            num%=10000;
            System.out.print(num/5000+" ");
            num%=5000;
            System.out.print(num/1000+" ");
            num%=1000;
            System.out.print(num/500+" ");
            num%=500;
            System.out.print(num/100+" ");
            num%=100;
            System.out.print(num/50+" ");
            num%=50;
            System.out.println(num/10+" ");
            num%=10;
        }
    }
}
