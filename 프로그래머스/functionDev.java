import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class functionDev {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds={1, 30, 5};
        System.out.println(solution(progresses,speeds));
    }

    public static ArrayList solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer =new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<progresses.length;i++){
            queue.add((int)Math.ceil((100.0-progresses[i])/speeds[i]));
        }

        while(!queue.isEmpty()){
            int min=queue.poll();
            int count=1;

            while (!queue.isEmpty()&&queue.peek()<=min) {
                queue.poll();
                count+=1;
            }
            answer.add(count);
        }
        return answer;
    }
}
