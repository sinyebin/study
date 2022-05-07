package 백준;
import java.util.*;
public class back10773 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        Stack <Integer> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<k;i++){
            int num=scanner.nextInt();
            if(num==0){
                stack.pop();
            }else{
                stack.push(num);
            }
        }
        for(int num : stack){
            sum+=num;
        }
        System.out.println(sum);
    }
}
