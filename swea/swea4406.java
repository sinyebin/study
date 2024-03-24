package swea;

import java.util.Scanner;

public class swea4406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
        for(int test_case = 1; test_case <= T; test_case++)
		{
            String str = sc.nextLine();
            String []arr = {"a","e","i","o","u"};
            for(int i=0;i<arr.length;i++){
                str=str.replace(arr[i], "");
            }
            System.out.println("#"+test_case+" "+str);
        }
    }
}
