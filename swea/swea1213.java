package swea;
import java.util.Scanner;
public class swea1213 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=10;
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int cnt=0;
            String a=sc.next();
            String b=sc.next();
            for(int i=0;i<=b.length()-a.length();i++){
             	String c=b.substring(i,i+a.length());
                if(c.equals(a))
                    cnt++;
            }
            System.out.println("#"+test_case+" "+cnt);
        }
    }
}
