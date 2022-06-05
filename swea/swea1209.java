package swea;
import java.util.Scanner;
public class swea1209 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T=10;
        for(int test_case = 1; test_case <= T; test_case++)
		{
            int num=sc.nextInt();
			int arr[][]=new int[100][100];
            for(int i=0;i<100;i++){
             	for(int j=0;j<100;j++){
                 	arr[i][j]=sc.nextInt();   
                }
            }
            int max=0;
            for(int i=0;i<100;i++){
                int temp1=0;
                int temp2=0;
             	for(int j=0;j<100;j++){
                    temp1+=arr[i][j];
                    temp2+=arr[j][i];
                }
                max=Math.max(max,Math.max(temp1,temp2));
            }
            int temp=0;
            for(int i=0;i<100;i++){
             	temp+=arr[i][i];
            }
            max=Math.max(max,temp);
            temp=0;
            for(int i=100-1,j=0;i>=0;i--,j++){
             	temp+=arr[j][i];   
            }
            max=Math.max(max,temp);
            System.out.println("#"+test_case+" "+max);
        }
    }
}
