import java.util.Collections;
import java.util.PriorityQueue;

public class process {
    public static void main(String[] args) {
        int[] priorities={1, 1, 9, 1, 1, 1};
        int location=5;
        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int n:priorities){
            pQueue.add(n);
        }

        while (!pQueue.isEmpty()) {
            for(int i=0;i<priorities.length;i++){
                if(priorities[i]==pQueue.peek()){
                    pQueue.poll();
                    answer++;
                    if(i==location){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
