package 백준;
import java.util.*;
public class back11866 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int num2=scanner.nextInt();
        boolean arr[]=new boolean[num];
        int temp=0;
        System.out.print("<");
        for(int i=0;i<num;i++){
            int count=0;
            while(count<num2){
                temp++;
                if(temp>=num){
                    temp%=num;
                }
                if(arr[temp]==false){
                    count++;
                }
            }
            arr[temp]=true;
            if(temp==0){
                temp=num;
            }
            if(i==num-1){
                System.out.print(temp+">");
            }else{
                System.out.print(temp+", ");
            }            
        }
    }
}
