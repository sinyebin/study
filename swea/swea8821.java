package swea;
import java.util.Scanner;
public class swea8821 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			String str=sc.next();
            int num[]=new int[10];
            int count=0;
            for(int i=0;i<str.length();i++){
                int temp=Integer.parseInt(str.substring(i,i+1));
                if(num[temp]==0){
                    count++;
                    num[temp]++;
                }else if(num[temp]==1){
                 	count--;   
                    num[temp]--;
                }
            }
            System.out.println("#"+test_case+" "+count);
        }
    }
}
