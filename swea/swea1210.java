package swea;
import java.util.Scanner;
public class swea1210 {
    static int dx[]={-1,1,0};
    static int dy[]={0,0,-1};
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T=10;
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int arr[][]=new int[100][100];
            int x=0;
            int y=99;
            int nx=0;
            int ny=0;
            for(int i=0;i<100;i++){
             	for(int j=0;j<100;j++){
                 	arr[i][j]=sc.nextInt();
                    if(arr[i][j]==2){
                     	x=j;   
                    }
                }
            }
            while(y!=0){
             	   for(int i=0;i<3;i++){
                    	nx=x+dx[i];
                       ny=y+dy[i];
                       if(arr[ny][nx]==1&&nx>=0&&nx<100){
                        	x=nx;
                           y=ny;
                           arr[ny][nx]=3;
                           break;
                       }
                   }
            }
            System.out.println("#"+test_case+" "+x);
        }
    }
}
