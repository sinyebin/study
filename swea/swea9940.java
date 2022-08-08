package swea;
import java.util.*;
public class swea9940 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int arr[]=new int[num];
            for(int i=0;i<arr.length;i++){
             	arr[i]=sc.nextInt();   
            }
            Arrays.sort(arr);
            boolean check=true;
            if(arr[0]!=1){
                System.out.println("#"+test_case+" No");
            }else{
                for(int i=1;i<arr.length;i++){
             	   	if(arr[i]==arr[i-1]){
                     	check=false;
                        break;
                    }
            	}
                if(check){
                    System.out.println("#"+test_case+" Yes");
                }else{
                    System.out.println("#"+test_case+" No");
                }
            }
        }
    }
}
