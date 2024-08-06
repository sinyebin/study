import java.util.Stack;

public class behindBigNumber {
    public static void main(String[] args) {
        int[] numbers={2, 3, 3, 5};
        solution(numbers);
    }
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=numbers.length-1;i>=0;i--){
            while (!stack.empty()&&numbers[i]>=stack.peek()) {
                stack.pop();
            }

            if(!stack.empty()){
                answer[i]=stack.peek();
            }else{
                answer[i]=-1;
            }

            stack.push(numbers[i]);
        }
        return answer;
    }
}
