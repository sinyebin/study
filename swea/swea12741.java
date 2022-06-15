package swea;
import java.util.Scanner;
public class swea12741 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int arr[]=new int[4];
            for(int i=0;i<4;i++){
             	arr[i]=sc.nextInt();   
            }
            int ans=0;
            if(arr[0]<arr[2]){
             	if(arr[1]<arr[2]){
                 	   ans=0;
                }else if(arr[1]<arr[3]){
                 	   ans=arr[1]-arr[2];
                }else{
                 	ans=arr[3]-arr[2];   
                }
            }else{
                if(arr[3]<arr[0]){
                 	   ans=0;
                }else if(arr[3]<arr[1]){
                 	   ans=arr[3]-arr[0];
                }else{
                 	ans=arr[1]-arr[0];   
                }
            }
            System.out.println("#"+test_case+" "+ans);
        }
    }
}
