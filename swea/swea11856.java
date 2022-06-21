package swea;
import java.util.Scanner;
public class swea11856 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			char ch[]=new char[4];
            String str=sc.next();
            int result=0;
            for(int i=0;i<4;i++){
                ch[i]=str.charAt(i);
            }
            for(int i=0;i<4;i++){
                int count=0;
                for(int j=0;j<4;j++){
                    if(ch[i]==ch[j]){
                    	count++;
                	}
                }
                if(count==2){
                 	result+=1;   
                }
            }
            
            if(result==4){
				System.out.println("#"+test_case+" Yes");
            }else{
                System.out.println("#"+test_case+" No");
            }
        }
    }
}
