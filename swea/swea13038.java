package swea;
import java.util.Scanner;
public class swea13038 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int arr[]=new int[7];
            int num=sc.nextInt();
            for(int i=0;i<7;i++){
             	arr[i]=sc.nextInt();
            }
           int min=Integer.MAX_VALUE;
            for(int i=0;i<7;i++){
             	if(arr[i]==0)
                    continue;
                int count=0;
                int start=i;
                while(true){
                 	if(arr[start%7]==1)
                        count++;
                    start++;
                    if(count==num){
                     	min=Math.min(min,start-i);
                        break;
                    }
                }
            }
            System.out.println("#"+test_case+" "+min);
        }
    }
}
