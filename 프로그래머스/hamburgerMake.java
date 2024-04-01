package 프로그래머스;

import java.util.Stack;

public class hamburgerMake {
    public static void main(String[] args) {
        int[] ingredient={2, 1, 1, 2, 3, 1, 2, 3, 1};
        solution(ingredient);
    }
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<ingredient.length;i++){
            stack.push(ingredient[i]);
            if(stack.size()>=4){
                int size=stack.size();
                if(stack.get(size-1)==1&&stack.get(size-2)==3&&stack.get(size-3)==2&&stack.get(size-4)==1){
                    answer+=1;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}
