package swea;
import java.util.Scanner;
public class swea1217 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T=10;
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int a=sc.nextInt();
            int num=sc.nextInt();
            int num2=sc.nextInt();
            int result=re(num,num2);
            System.out.println("#"+test_case+" "+result);
        }
    }
    static int re(int num,int num2){
        if(num2==1){
        	return num;
        }else{
     		return num*re(num,num2-1);   
        }
    }
}
