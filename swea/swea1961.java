package swea;
import java.util.Scanner;
public class swea1961 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int [][]arr=new int[num][num];
            for(int i=0;i<num;i++){
             	for(int j=0;j<num;j++){
                 	arr[i][j]=sc.nextInt();   
                }
            }
            int [][]result_90=rot(arr);
            int [][]result_180=rot(result_90);
            int [][]result_270=rot(result_180);
            System.out.println("#"+test_case);
            for(int i=0;i<arr.length;i++){
             	for(int j=0;j<arr.length;j++){
                 	System.out.print(result_90[i][j]);   
                }
                System.out.print(" ");
                for(int j=0;j<arr.length;j++){
                 	System.out.print(result_180[i][j]);   
                }
                System.out.print(" ");
                for(int j=0;j<arr.length;j++){
                 	System.out.print(result_270[i][j]);   
                }
                System.out.println();
            }
        }
    }
    public static int[][]rot(int [][]arr){
        int result[][]=new int[arr.length][arr.length];
     	for(int i=0;i<arr.length;i++){
         	for(int j=0;j<arr.length;j++){
             	result[i][j]=arr[arr.length-j-1][i];
            }
        }
        return result;
    }
}
