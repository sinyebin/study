package 프로그래머스;

import java.util.Stack;

public class bracketTurn {
    public static void main(String[] args) {
        System.out.println("[](){}");
    }
    public static int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            Stack <Character> stack = new Stack<>();
            for(int j=0;j<s.length();j++){
                if(stack.empty()){
                    stack.push(s.charAt(j));
                }else if(stack.peek()=='['){
                    if(s.charAt(j)==']'){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(j));
                    }
                }else if(stack.peek()=='('){
                    if(s.charAt(j)==')'){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(j));
                    }
                }else if(stack.peek()=='{'){
                    if(s.charAt(j)=='}'){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(j));
                    }
                }else{
                    break;
                }
            }
            if(stack.empty()){
                answer++;
            }
            s=s.substring(1)+s.charAt(0);
        }
        return answer;
    }
}
