package swea;
import java.util.Scanner;
public class swea1859 {
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
            int max=arr[num-1];
            int ans=0;
            for(int i=num-2;i>=0;i--){
                if(max>arr[i]){
                    ans+=max-arr[i];
                }else{
                    max=arr[i];
                }
            }
            System.out.println("#"+test_case+" "+ans);
        }
    }
}
