package 프로그래머스;

import java.util.Arrays;

public class h_index {
    public static void main(String[] args) {
        int []citations = {3,0,6,1,5};
        System.out.println(solution(citations));
    }
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int h=citations.length-i;
            if(citations[i]>=h){
                answer=h;
                break;
            }
            
        }
        return answer;
    }
}
