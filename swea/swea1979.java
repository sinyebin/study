package swea;
import java.util.Scanner;
public class swea1979 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int num2=sc.nextInt();
            int arr[][]=new int[num][num];
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int answer=0;
            for(int i=0;i<num;i++){
                int count=0;
                for(int j=0;j<num;j++){
                   if(arr[i][j]==1){
                       count++;
                   }else{
                    	if(count==num2){
                            answer++;
                        }
                       count=0;
                   }
                }
                if(count==num2){
                    answer++;
                }
            }
            for(int i=0;i<num;i++){
                int count=0;
                for(int j=0;j<num;j++){
                   if(arr[j][i]==1){
                       count++;
                   }else{
                    	if(count==num2){
                            answer++;
                        }
                       count=0;
                   }
                }
                if(count==num2){
                    answer++;
                }
            }
            System.out.println("#"+test_case+" "+answer);
        }
    }
}
