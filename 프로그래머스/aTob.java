package 프로그래머스;

import java.util.Arrays;

public class aTob {
    public static void main(String args[]){
        solution("olleh","hello");
    }
    public static  int solution(String before, String after) {
        int answer = 1;
        char[]be=before.toCharArray();
        char[]af=after.toCharArray();
        Arrays.sort(be);
        Arrays.sort(af);
        for(int i=0;i<be.length;i++){
            if(be[i]!=af[i]){
                answer=0;
                break;
            }
        }
        return answer;
    }
}
