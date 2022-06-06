package swea;
import java.util.*;
public class swea1984 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int arr[]=new int[10];
            for(int i=0;i<10;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int num=0;
            int count=0;
            for(int i=1;i<9;i++){
                	num+=arr[i];
                   
            }
            System.out.println("#"+test_case+" "+Math.round(num/(double)8));
        }
    }
}
