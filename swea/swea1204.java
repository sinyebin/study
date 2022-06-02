package swea;
import java.util.Scanner;
public class swea1204 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int arr[]=new int[101];
            int num=sc.nextInt();
            for(int i=0;i<1000;i++){
             	int score=sc.nextInt();
                arr[score]++;
            }
            int max=0;
            int result=0;
            for(int i=0;i<101;i++){
                if(max<=arr[i]){
                    max=arr[i];
                    result=i;
                }
            }
            System.out.println("#"+test_case+" "+result);
        }
    }
}
