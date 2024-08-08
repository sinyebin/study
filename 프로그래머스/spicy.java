import java.util.PriorityQueue;

public class spicy {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k=7;
        solution(scoville, k);
    }
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0;i<scoville.length;i++){
            queue.add(scoville[i]);
        }

        while (queue.peek()<K) {
            if(queue.size()==1){
                return -1;
            }
            queue.add(queue.poll()+queue.poll()*2);
            answer++;
        }
        return answer;
    }
}
