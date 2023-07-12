package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class hallOfFame1 {
    public static void main(String[] args) {
        int []score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(solution(3,score));
    }
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        if(k<score.length){
            for(int i=0;i<k;i++){
                list.add(score[i]);
                Collections.sort(list);
                answer[i]=list.get(0);
            }
            for(int i=k;i<score.length;i++){
                list.add(score[i]);
                Collections.sort(list);
                list.remove(0);
                answer[i]=list.get(0);
            }
        }else{
            for(int i=0;i<score.length;i++){
                list.add(score[i]);
                Collections.sort(list);
                answer[i]=list.get(0);
            }
        }
        
        
        return answer;
    }
}
