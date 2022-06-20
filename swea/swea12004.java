package swea;
import java.util.*;
public class swea12004 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			boolean check=false;
            int num=sc.nextInt();
            for(int i=1;i<10;i++){
             	if(num%i==0){
                 	if(num/i<10){
                     	check=true;
                        break;
                    }
                }
            }
            if(check==true){
             	System.out.println("#"+test_case+" Yes");   
            }else{
                System.out.println("#"+test_case+" No");   
            }
        }
    }
}
