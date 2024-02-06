package 프로그래머스;

import java.util.Arrays;

public class fruitMarket {
    public static void main(String[] args) {
        int k=3;
        int m=4;
        int []score={1,2,3,1,2,3,1};
        solution(3, 4, score);
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int num=score.length%m;
        for(int i=0;i<score.length/m;i++){
            int price=score[i*m+num];
            if(price<k){
                answer+=price*m;
            }else{
                answer+=k*m;
            }
        }
        return answer;
    }
}
