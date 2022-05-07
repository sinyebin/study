package 프로그래머스;
import java.util.*;
public class k_intern2 {
    public static void main(String args[]){
        int []queue1={1,1};
        int []queue2={1,5};
        solution(queue1, queue2);
    }
    static int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long qu1=0;
        long qu2=0;
        Queue<Integer> que1=new LinkedList<>();
        Queue<Integer> que2=new LinkedList<>();
        for(int i=0;i<queue1.length;i++){
            que1.add(queue1[i]);
            qu1+=queue1[i];
            que2.add(queue2[i]);
            qu2+=queue2[i];
        }
        while(!que1.isEmpty()&&!que2.isEmpty()){
            if(qu1==qu2){
                break;
            }
            if(qu1>qu2){
                int temp=que1.poll();
                qu1-=temp;
                qu2+=temp;
                que2.add(temp);
                answer++;
            }else{
                int temp=que2.poll();
                qu1+=temp;
                qu2-=temp;
                que1.add(temp);
                answer++;
            }
        }
        if(qu1!=qu2){
            answer=-1;
        }
        return answer;
    }
}
