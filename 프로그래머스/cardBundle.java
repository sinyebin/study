package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

public class cardBundle {
    public static void main(String[] args) {
        String[] cards1={"i",  "water","drink"};
        String[] cards2={"want", "to"};
        String[] goal={"i", "want", "to", "drink", "water"};
        solution(cards1, cards2, goal);
    }
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        for(String card:cards1){
            queue1.add(card);
        }
        for(String card:cards2){
            queue2.add(card);
        }
        for(String result:goal){
            boolean check=false;
            if(!queue1.isEmpty()){
                if(queue1.peek().equals(result)){
                    queue1.remove();
                    check=true;
                }
            }
            if(!queue2.isEmpty()){
                if(queue2.peek().equals(result)){
                    queue2.remove();
                    check=true;
                }
            }
            if(!check){
                answer="No";
                return answer;
            }
        }
        return answer;
    }
}
