import java.util.Stack;

public class stockPrice {
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3,1,5,2};
        solution(prices);
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty()&&prices[i]<prices[stack.peek()]){
                answer[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()]=prices.length-stack.peek()-1;
            stack.pop();
            
        }
        return answer;
    }
}
