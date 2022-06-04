package swea;
import java.util.Scanner;
public class swea2805 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int arr[][]=new int[num][num];
            for(int i=0;i<num;i++){
                String str=sc.next();
             	for(int j=0;j<num;j++){
                 	arr[i][j]=str.charAt(j)-'0';
                }
            }
            int ans=0;
            for(int i=0;i<num/2;i++){
             	   for(int j=num/2-i;j<=num/2+i;j++){
                    	   ans+=arr[i][j];
                   }
            }
            for(int i=num/2;i>=0;i--){
             	for(int j=num/2-i;j<=num/2+i;j++){
                 	ans+=arr[num-i-1][j];   
                }
            }
            System.out.println("#"+test_case+" "+ans);
        }
    }
}
