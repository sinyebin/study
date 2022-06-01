package swea;
import java.util.Scanner;
public class swea2005 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			System.out.println("#"+test_case);
            int num=sc.nextInt();
            int arr[][]=new int [num][num];
            for(int i=0;i<num;i++){
             	for(int j=0;j<=i;j++){
                 	if(i==j||j==0)
                        arr[i][j]=1;
                    else
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
            for(int i=0;i<num;i++){
                 for(int j=0;j<=i;j++){
                     System.out.print(arr[i][j]+" ");
                  }
                 System.out.println();
                
            }
        }
    }
}
