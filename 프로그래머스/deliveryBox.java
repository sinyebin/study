package 프로그래머스;
import java.util.*;

public class deliveryBox {

    public static void main(String[] args) {
        int [] order = {5,4,3,2,1};    
        solution(order);
    }

    public static int solution(int[] order) {
        int answer = 0;
        int idx = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=1;i<=order.length;i++){
            stack.push(i);
            while (!stack.isEmpty()) {
                if(stack.peek()==order[idx]){
                    stack.pop();
                    idx++;
                    answer++;
                }else{
                    break;
                }
            }
        }
        return answer;
    }
    
}