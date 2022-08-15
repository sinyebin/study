package swea;
import java.util.Scanner;
public class swea8741 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str=sc.nextLine();
            String str1[]=str.split(" ");
            String ans="";
           
            for(int i=0;i<str1.length;i++){
             	  ans+=str1[i].substring(0,1);
            }
            String ans2=ans.toUpperCase();
            System.out.println("#"+test_case+" "+ans2);
        }
    }
}
