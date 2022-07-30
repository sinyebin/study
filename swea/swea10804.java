package swea;
import java.util.Scanner;
public class swea10804 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			String str=sc.next();
            String ans="";
            for(int i=str.length()-1;i>=0;i--){
                char ch=str.charAt(i);
                if(ch=='b'){
                 	ans+="d";   
                }else if(ch=='d'){
                 	ans+="b";
                }else if(ch=='p'){
                 	ans+="q";   
                }else{
                 	ans+="p";   
                }
            }
            System.out.println("#"+test_case+" "+ans);
        }
    }
}
