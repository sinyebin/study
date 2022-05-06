package 프로그래머스;
import java.util.*;
public class failure_rate {
    static class Rate{
        int idx;
        double rate;
        public Rate(int idx, double rate){
            this.rate=rate;
            this.idx=idx;
        }
    }
    public static void main(String args[]){
        int N=5;
        int []stages={2, 1, 2, 6, 2, 4, 3, 3};
        solution(N,stages);
    }
    static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int []user_cnt = new int[N+1];
        int [] user_total_cnt = new int[N+1];
        for(int i=0;i<stages.length;i++){
            user_cnt[stages[i]-1]++;
        }
        user_total_cnt[N]=user_cnt[N];
        for(int i=N-1;i>=0;i--){
            user_total_cnt[i]=user_cnt[i]+user_total_cnt[i+1];
        }
        ArrayList<Rate> arr = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(user_cnt[i]==0){
                arr.add(new Rate(i,0));
                continue;
            }
            double rate=(double)user_cnt[i]/user_total_cnt[i];
            arr.add(new Rate(i,rate));
        }
        Collections.sort(arr,((o1,o2) -> Double.compare(o2.rate,o1.rate)));
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i).idx+1;
        }
        return answer;
    }
}
