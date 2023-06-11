package 프로그래머스;

import java.util.HashMap;

public class proximate {
    public static void main(String[] args) {
        solution("banana");
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>( );
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                answer[i]=i-map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }else{
                map.put(s.charAt(i), i);
                answer[i]=-1;
            }
        }
        return answer;
    }
}
