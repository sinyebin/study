import java.util.Scanner;

public class back15652 {
    public static int arr[];
    public static int n,m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr=new int[m];       
        
        dfs(1,0);
        System.out.println(sb);
    }
    public static void dfs(int a,int depth) {
		if (depth == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
 
		for (int i = a; i <= n; i++) {
			arr[depth] = i;
			dfs(i,depth + 1);
		}
	}
}
