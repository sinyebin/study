package 백준;
import java.util.Scanner;
public class back14178 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num1=sc.nextInt();
            int num2=sc.nextInt();
            int count=0;
            int temp=1;
            while(temp<=num1){
             	temp+=(num2*2)+1;
                count++;
            }
            System.out.println("#"+test_case+" "+count);
        }
    }
}
