package swea;
import java.util.Scanner;
public class swea9317 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            int count=0;
            for(int i=0;i<num;i++){
             	   if(str1.charAt(i)==str2.charAt(i)){
                    	count++;   
                   }
            }
            System.out.println("#"+test_case+" "+count);
        }
    }
}
