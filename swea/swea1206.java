package swea;
import java.util.Scanner;
public class swea1206 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T=10;
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int arr[]=new int[num];
            int arr2[]=new int[num];
            for(int i=0;i<num;i++){
             	arr[i]=sc.nextInt();   
            }
            for(int i=0;i<num;i++){
             	int min=255;
                if(i>=1&&arr[i]-arr[i-1]>0){
                 	   min=Math.min(min,arr[i]-arr[i-1]);
                }else{
                	min=0;
                }
                if(i>=2&&arr[i]-arr[i-2]>0){
                 	   min=Math.min(min,arr[i]-arr[i-2]);
                }else{
                	min=0;
                }
                if(i+1<num&&arr[i]-arr[i+1]>0){
                 	   min=Math.min(min,arr[i]-arr[i+1]);
                }else{
                	min=0;
                }
                if(i+2<num&&arr[i]-arr[i+2]>0){
                 	   min=Math.min(min,arr[i]-arr[i+2]);
                }else{
                	min=0;
                }
                arr2[i]=min;
            }
            int answer=0;
            for(int i=0;i<num;i++){
                answer+=arr2[i];
            }
            System.out.println("#"+test_case+" "+answer);
        }
    }
}
