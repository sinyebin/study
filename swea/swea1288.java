package swea;
import java.util.Scanner;
public class swea1288 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			boolean arr[]=new boolean[10];
            String A=sc.next();
            int num=Integer.parseInt(A);
            int count=0;
            int cnt=1;
            while(true){
             	for(int i=0;i<A.length();i++){
                 	int temp=Integer.parseInt(A.substring(i,i+1));
                    if(arr[temp]==false){
                     	arr[temp]=true;
                        count++;
                    }
                }
                if(count==10)
                    break;
                else{
                    cnt++;
                    A=Integer.toString(num*cnt);
                }
            }
            System.out.println("#"+test_case+" "+A);
        }
    }
}
