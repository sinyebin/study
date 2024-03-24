import java.util.Scanner;

public class back21736 {
    static int n;
    static int m;
    static int dx[]={-1,1,0,0};
    static int dy[]={0,0,-1,1};
    static int cnt=0;
    static boolean[][] visit;
    static char campus[][];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();

        int x=0;
        int y=0;
        campus= new char[n][m];
        visit = new boolean[n][m];
        scanner.nextLine();
        for(int i=0;i<n;i++){
            String arr=scanner.nextLine();
            for(int j=0;j<m;j++){
                campus[i][j]=arr.charAt(j);
                if(campus[i][j]=='I'){
                    x=i;
                    y=j;
             }
            }
        }

        DFS(x, y);

        if(cnt ==0){
            System.out.println("TT");
        }else{
            System.out.println(cnt);
        }
    }

    public static void DFS(int x,int y){
        visit[x][y]=true;
        if(campus[x][y]=='P'){
            cnt+=1;
        }
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=0&&nx<n&&ny<m&&!visit[nx][ny]){
                if(campus[nx][ny]!='X'){
                    DFS(nx,ny);
                }
            }
        }
    }
}
