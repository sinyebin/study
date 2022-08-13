package swea;
import java.util.*;
public class swea8931 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            Stack <Integer> stack=new Stack<>();
            int ans=0;
            for(int i=0;i<num;i++){
                int temp=sc.nextInt();
                if(temp!=0){
                 	stack.push(temp);   
                }else{
                 	stack.pop();   
                }                    
            }
           for(Integer a:stack){
            	ans+=a;   
           }
            System.out.println("#"+test_case+" "+ans);
        }
    }
}
