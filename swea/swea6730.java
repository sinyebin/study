package swea;

import java.util.Scanner;

public class swea6730 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
            int arr[]=new int[n];
            int up=0;
            int down=0;
            int before=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            before=arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]>before){
                    if(up<arr[i]-before){
                        up=arr[i]-before;
                    }
                    
                }else{
                    if(down<before-arr[i]){
                        down=before-arr[i];
                    }
                }
                before=arr[i];
            }

            System.out.println("#"+test_case+" "+up+" "+down);
        }
    }
}
