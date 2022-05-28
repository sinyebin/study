package swea;
import java.util.Scanner;
public class swea1954 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
            int num=sc.nextInt();
            int arr[][]=new int[num][num];
            int dx[]={1,0,-1,0};
            int dy[]={0,1,0,-1};
            int dd[]={0,1,2,3};
            int n=1;
            int x=0;
            int y=0;
            int d=0;
            while(n<=num*num){
                int nx=x+dx[dd[d]];
                int ny=y+dy[dd[d]];
                if(nx<0||nx>=num||ny<0||ny>=num||arr[ny][nx]!=0){
                    d=(d+1)%4;
                    nx=x+dx[dd[d]];
                    ny=y+dy[dd[d]];
                }
                arr[y][x]=n++;
                x=nx;
                y=ny;
            }
            System.out.println("#"+test_case);
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
