package 백준;
import java.util.*;
public class back1260 {
    static int[][]arr;
    static boolean[]check;
    static int n;
    static int m;
    static int v;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        v=scanner.nextInt();
        arr=new int[n+1][n+1];
        check=new boolean[n+1];
        for(int i=0;i<m;i++){
            int temp1=scanner.nextInt();
            int temp2=scanner.nextInt();
            arr[temp1][temp2]=arr[temp2][temp1]=1;
        }
        dfs(v);
        check=new boolean[n+1];
        System.out.println();
        bfs();
    }
    public static void dfs(int k){
        check[k]=true;
        System.out.print(k+" ");
        for(int i=1;i<=n;i++){
            if(arr[k][i]==1&&check[i]==false){
                dfs(i);
            }
        }
    }
    public static void bfs(){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(v);
        check[v]=true;
        System.out.print(v+" ");
        while(!queue.isEmpty()){
            int temp=queue.poll();
            for(int j=1;j<=n;j++){
                if(arr[temp][j]==1&&check[j]==false){
                    queue.offer(j);
                    check[j]=true;
                    System.out.print(j+" ");
                }
            }
        }
    }
}
