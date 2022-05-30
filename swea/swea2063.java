package swea;
import java.util.*;
public class swea2063 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int num[]=new int[T];
		for(int test_case = 1; test_case <= T; test_case++)
		{
			num[test_case-1]=sc.nextInt();

        }
        Arrays.sort(num);
        System.out.println(num[num.length/2]);   
    }
}
