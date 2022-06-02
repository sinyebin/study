package swea;
import java.util.*;
public class swea1966 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
            int num=sc.nextInt();
			int arr[]=new int[num];
            for(int i=0;i<num;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.print("#"+test_case+" ");
             System.out.print(arr[0]+" ");
            for(int i=1;i<num;i++){
               // if(arr[i]!=arr[i-1])
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
