package swea;
import java.util.Scanner;
public class swea1989 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str=sc.nextLine();
            boolean check=true;
            for(int i=0;i<str.length()/2;i++){
                char ch=str.charAt(i);
                if(ch!=str.charAt(str.length()-i-1)){
                 	check=false;
                    break;
                }
            }
            System.out.print("#"+test_case);
            if(!check){
                System.out.println(" "+0);
            }else{
                System.out.println(" "+1);
            }
        }
    }
}
