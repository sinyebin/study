package swea;
import java.util.Scanner;
public class swea1959 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			int num1=sc.nextInt();
            int num2=sc.nextInt();
            int []arr1=new int[num1];
            int []arr2=new int[num2];
            for(int i=0;i<num1;i++){
             	arr1[i]=sc.nextInt();
            }
            for(int i=0;i<num2;i++){
             	arr2[i]=sc.nextInt();   
            }
            long max=0;
            if(num1>num2){
             	   for(int i=0;i<num1-num2+1;i++){
                 	int temp=0;
                    for(int j=0;j<num2;j++){
                        temp+=arr1[i+j]*arr2[j];
                    }
                    max=Math.max(max,temp);
                }
            }else{
            	for(int i=0;i<num2-num1+1;i++){
                 	int temp=0;
                    for(int j=0;j<num1;j++){
                        temp+=arr2[i+j]*arr1[j];
                    }
                    max=Math.max(max,temp);
                }
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}
