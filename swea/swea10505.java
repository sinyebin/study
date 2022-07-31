package swea;
import java.util.Scanner;
public class swea10505 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int arr[]=new int[num];
            int sum=0;
            int count=0;
            for(int i=0;i<num;i++){
             	arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            for(int i=0;i<num;i++){
             	if(arr[i]<=sum/num){
                    count++;
                }
            }
            System.out.println("#"+test_case+" "+count);
        }
    }
}
