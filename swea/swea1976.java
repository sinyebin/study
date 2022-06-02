package swea;
import java.util.Scanner;
public class swea1976 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int arr[]=new int [4];
            for(int i=0;i<4;i++){
             	arr[i]=sc.nextInt();   
            }
            int h=arr[0]+arr[2];
            int m=arr[1]+arr[3];
            if(m>=60){
                h++;
                m%=60;
            }
            if(h>12){
                h%=12;
            }
            if(h==0){
                h=12;
            }
            System.out.println("#"+test_case+" "+h+" "+m);
        }
    }
}
