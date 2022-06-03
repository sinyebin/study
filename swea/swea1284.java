package swea;
import java.util.Scanner;
public class swea1284 {
    public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int p=sc.nextInt();
            int q= sc.nextInt();
            int r=sc.nextInt();
            int s=sc.nextInt();
            int w=sc.nextInt();
            
            int min=p*w;
            if(w<=r){
             	min=Math.min(min,q);   
            }else{
             	int cost=w-r;
                min=Math.min(min,q+cost*s);
            }
            System.out.println("#"+test_case+" "+min);
        }
    }
}
