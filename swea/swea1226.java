package swea;
import java.util.*;
public class swea1226 {
    static int dx[]={-1,1,0,0};
    static int dy[]={0,0,-1,1};
    static int answer=0;
    static char arr[][]=new char[16][16];
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T=10;
        for(int test_case = 1; test_case <= T; test_case++)
		{
            int x=1;
            int y=1;
            int num=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<16;i++){
                String str=sc.nextLine();
                arr[i]=str.toCharArray();
            }
            dfs(1,1);
            System.out.println("#"+test_case+" "+answer);
        }

    }
    static void dfs(int y,int x){
        for(int i=0;i<4;i++){
            if(answer==1){
                return;
            }
            int ny=y+dy[i];
            int nx=x+dx[i];
            if(ny<0||nx<0||ny>=16||nx>=16){
                continue;
            }
            if(arr[ny][nx]=='3'){
                answer=1;
                return;
            }
            if(arr[ny][nx]=='0'){
                arr[ny][nx]='1';
                dfs(ny,nx);
            }
        }
    }
}
