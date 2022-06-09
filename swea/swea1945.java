package swea;
import java.util.Scanner;
public class swea1945 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
            int n=sc.nextInt();
            int a=0;
            int b=0;
            int c=0;
            int d=0;
            int e=0;
            while(true){
             	if(n%2==0){
                 	n/=2;
                    a++;
                }else if(n%3==0){
                 	n/=3;
                    b++;
                }else if(n%5==0){
                 	n/=5;
                    c++;
                }else if(n%7==0){
                 	n/=7;
                    d++;
                }else if(n%11==0){
                 	n/=11;
                    e++;
                }
                if(n==1)
                    break;
            }
            System.out.println("#"+test_case+" "+a+" "+b+" "+c+" "+d+" "+e);
        }
    }
}
