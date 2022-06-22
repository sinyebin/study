package swea;
import java.util.*;
public class swea11736 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num=sc.nextInt();
            int arr[]=new int[num];
            int count=0;
            for(int i=0;i<num;i++){
             	arr[i]=sc.nextInt();   
            }
            for(int i=1;i<num-1;i++){
             	if(arr[i-1]<arr[i]&&arr[i+1]>arr[i]){
                    count++;
                }else if(arr[i-1]>arr[i]&&arr[i+1]<arr[i]){
                 	count++;   
                }
            }
            System.out.println("#"+test_case+" "+count);
        }
    }
}
