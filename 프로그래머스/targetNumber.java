public class targetNumber {
    static int answer=0;
    public static void main(String[] args) {
        int [] numbers={1,1,1,1};
        int target=3;
        solution(numbers, target);
    }
    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    public static void dfs(int[] numbers,int depth, int target, int sum){
        if(depth==numbers.length){
            if(target==sum){
                answer++;
            }
        }else{
            dfs(numbers, depth+1, target, sum+numbers[depth]);
            dfs(numbers, depth+1, target, sum-numbers[depth]);
        }
    }
}
