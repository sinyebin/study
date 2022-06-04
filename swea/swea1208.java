package swea;
import java.util.*;
public class swea1208 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T=10;
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int dump=sc.nextInt();
            int []arr=new int[100];
            for(int i=0;i<arr.length;i++){
             	arr[i]=sc.nextInt();   
            }
            Arrays.sort(arr);
            for(int i=0;i<dump;i++){
             	arr[0]++;
                arr[99]--;
                Arrays.sort(arr);
            }
            System.out.println("#"+test_case+" "+(arr[99]-arr[0]));
        }
    }
}
