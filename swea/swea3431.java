package swea;

import java.util.Scanner;

public class swea3431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>c){
                System.out.println("#"+test_case+" "+(a-c));
            }else if(b<c){
                System.out.println("#"+test_case+" -1");
            }else{
                System.out.println("#"+test_case+" 0");
            }
        }
    }
}
