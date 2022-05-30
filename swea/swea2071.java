package swea;
import java.util.Scanner;
public class swea2071 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
            double num=0;
			for(int j=0;j<10;j++){
            	num+=sc.nextInt();
            }
            System.out.println("#"+test_case+" "+Math.round(num/10));
        }
    }
}
