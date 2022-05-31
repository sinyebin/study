package swea;
import java.util.Scanner;
public class swea1926 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int i = 1; i <= T; i++)
		{
			int count=0;
            if(i<10){
                if(i%3==0){
                    System.out.print("- ");
                }else{
                 	System.out.print(i+" ");   
                }
            }else{
                String str=Integer.toString(i);
                String num[]=str.split("");
                for(int j=0;j<num.length;j++){
                    if(num[j].contains("3")||num[j].contains("6")||num[j].contains("9")){
                        count++;
                    }
                }
                if(count==0){
                	System.out.print(i+" ");
                }else{
                    for(int j=0;j<count;j++){
                        System.out.print("-");
                    }
                    System.out.print(" ");
                }
            }
        }
    }
}
