import java.util.Scanner;

public class back2740 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m= scanner.nextInt();
        int A[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=scanner.nextInt();
            }
        }
        m=scanner.nextInt();
        int k=scanner.nextInt();
        int B[][]=new int[m][k];
        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++){
                B[i][j]=scanner.nextInt();
            }
        }
        int C[][]=new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                for(int l=0;l<m;l++){
                    C[i][j]+=A[i][l]*B[l][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
