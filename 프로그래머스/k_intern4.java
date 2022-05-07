package 프로그래머스;
import java.util.*;
public class k_intern4 {
    static boolean check[];
    static int[][]arr;
    public static void main(String args[]){
        int n=6;
        int [][]paths={{1, 2, 3},{2,3,5},{2,4,2},{2,5,4},{3,4,4},{4,5,3},{4,6,1},{5,6,1}};
        int []gates={1,3};
        int []summits={5};
        solution(n, paths, gates, summits);
    }
    static int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        int[] answer = new int[2];
        arr=new int[n][n];
        int min_intensity=10000000;
        int min_num=n;
        for(int i=0;i<paths.length;i++){
            arr[paths[i][0]-1][paths[i][1]-1]=paths[i][2];
            arr[paths[i][1]-1][paths[i][0]-1]=paths[i][2];
        }
        check=new boolean[n];
        for(int i=0;i<gates.length;i++){
            check[gates[i]-1]=true;
        }
        for(int i=0;i<gates.length;i++){
            int j=0;
            while(true){
                arr[gates[i]][j]
            }
        }
        dfs(gates[0]-1);
        return answer;
    }
    static void dfs(int x) {
        check[x] = true;
        System.out.println(x);
        for (int i = 0; i < 6; i++) {
        // 간선이 아직 있고, 아직 방문하지 않았으면!
            if (arr[x][i] != 0 && check[i] == false) {
                dfs(i);
            }
        }
    }
    
}
