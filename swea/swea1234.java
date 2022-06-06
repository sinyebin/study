package swea;
import java.util.*;
public class swea1234 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=10;
        for(int test_case = 1; test_case <= T; test_case++)
		{
            Stack<Integer> stack=new Stack<>();
			int num=sc.nextInt();
            int []arr=new int[num];
            String str=sc.next();
            int count=0;
            for(int i=0;i<num;i++){
             	   arr[i]=str.charAt(i)-'0';
            }
            for(int i=0;i<num;i++){
             	if(!stack.empty()){
                    if(stack.peek()==arr[i]){
                        count++;
                        stack.pop();
                    }else{
                     	stack.push(arr[i]);   
                    }
                }else{
                 	stack.push(arr[i]);   
                }
            }
            int arr2[]=new int[num-count*2];
            for(int i=num-count*2-1;i>=0;i--){
                arr2[i]=stack.pop();
            }
            String answer="";
            for(int i=0;i<arr2.length;i++){
                answer+=arr2[i];
            }
            System.out.println("#"+test_case+" "+answer);
        }
    }
}
