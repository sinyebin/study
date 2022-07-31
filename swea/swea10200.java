package swea;
import java.util.Scanner;
public class swea10200 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int max=0;
            int min=0;
            if(a>b){
                max=b;
            }else{
             	max=a;   
            }
            if(n>a+b){
             	min=0;   
            }else{
             	min=a+b-n;   
            }
            System.out.println("#"+test_case+" "+ max+" "+min);
        }
    }
}
