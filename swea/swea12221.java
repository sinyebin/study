package swea;
import java.util.Scanner;
public class swea12221 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num1=sc.nextInt();
            int num2=sc.nextInt();
            int ans=0;
            if(num1>=10||num2>=10){
                ans=-1;
            }else{
             	ans=num1*num2;   
            }
            System.out.println("#"+test_case+" "+ans);
        }
    }    
}
