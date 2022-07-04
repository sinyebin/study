package 백준;
import java.util.*;
public class back1874 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n= scanner.nextInt();
        int start=0;
        for(int i=0;i<n;i++){
            int num=scanner.nextInt();
            if(num>start){
                for(int j=start+1;j<=num;j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start=num;
            }else if(stack.peek()!=num){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");            
        }
        System.out.println(sb);
    }
}
