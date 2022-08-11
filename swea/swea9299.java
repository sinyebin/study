package swea;
import java.util.*;
public class swea9299 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num1=sc.nextInt();
            int num2=sc.nextInt();
            int max=0;
            int arr[]=new int[num1];
            for(int i=0;i<num1;i++){
             	arr[i]=sc.nextInt();   
            }
            Arrays.sort(arr);
            boolean check=false;
            for(int i=0;i<num1-1;i++){
             	for(int j=i+1;j<num1;j++){
                 	int temp=arr[i]+arr[j];
                    if(temp<=num2){
							max=Math.max(max,temp);   
                        check=true;
                    }
                }
            }
            if(!check){
             	max=-1;   
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}
