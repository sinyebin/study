package 프로그래머스;
import java.util.*;
public class bracket {
    public static void main(String args[]){
        String s=")()(";
        solution(s);
    }
    static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char word=s.charAt(i);
            if(word=='('){
                stack.push(word);
            }else{
                if(stack.empty()){
                    answer=false;
                    break;
                }else if(stack.peek()=='('){
                    stack.pop();
                }else{
                    answer=false;
                    break;
                }
            }
        }
        if(!stack.empty()){
            answer=false;
        }
        return answer;
    }
}
