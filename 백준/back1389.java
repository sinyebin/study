import java.util.Scanner;

public class back1389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m = scanner.nextInt();
        int [][]arr=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i!=j){
                    arr[i][j]=99999;
                }
            }
        }
        for(int i=0;i<m;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;
        }
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    arr[i][j]=Math.min(arr[i][j], arr[i][k]+arr[k][j]);
                }
            }
        }

        int min=Integer.MAX_VALUE;
        int minIndex=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=n;j++){
                sum+=arr[i][j];
            }
            if(min>sum){
                min=sum;
                minIndex=i;
            }
        }
        System.out.println(minIndex);
    }
}
