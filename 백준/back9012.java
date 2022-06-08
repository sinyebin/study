package 백준;
import java.util.*;
public class back9012 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<num;i++){
            String answer="YES";
            Stack <Character> stack=new Stack<>();
            String str=scanner.nextLine();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='('){
                    stack.push('(');
                }else if(!stack.empty()){
                    stack.pop();
                }else{
                    answer="NO";
                    break;
                }
            }
            if(!stack.empty()){
                answer="NO";
            }
            System.out.println(answer);
        }
    }
}
