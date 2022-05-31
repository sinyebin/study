package swea;
import java.util.Scanner;
public class swea2019 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int num=1;
		for(int test_case = 0; test_case <= T; test_case++)
		{
			System.out.print(num+" ");
            num*=2;
        }
    }
}
