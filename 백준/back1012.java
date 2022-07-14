package 백준;
import java.util.*;
public class back1012 {
    static boolean check[][];
    static int arr[][];
    static int ans=0;
    static int m,n,k;
    static int []dx={0,-1,0,1};
    static int []dy={1,0,-1,0};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            m=scanner.nextInt();
            n=scanner.nextInt();
            k=scanner.nextInt();
            arr=new int[m][n];
            check=new boolean[m][n];
            ans=0;
            for(int j=0;j<k;j++){
                int x=scanner.nextInt();
                int y=scanner.nextInt();
                arr[x][y]=1;
            }
            for(int j=0;j<m;j++){
                for(int l=0;l<n;l++){
                    if(arr[j][l]==1&&!check[j][l]){
                        dfs(j,l);
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
    static void dfs(int x, int y){
        check[x][y]=true;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=00&&nx<m&&ny<n){
                if(!check[nx][ny]&&arr[nx][ny]==1){
                    dfs(nx,ny);
                }
            }
        }
    }
}
