package swea;
import java.util.Scanner;
public class swea12368 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num1=sc.nextInt();
            int num2=sc.nextInt();
            int clock=num1+num2;
            System.out.println("#"+test_case+" "+clock%24);
        }
    }
}
