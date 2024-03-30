package 프로그래머스;

import java.util.HashSet;

public class twoPassword {
    public static void main(String[] args) {
        String s="aukks";
        String skip="wbqd";
        int index=5;
        solution(s, skip, index);
    }
    public static String solution(String s, String skip, int index) {
        String answer = "";
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<skip.length();i++){
            set.add(skip.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int j=0;
            while(j<index){
                c+=1;
                if(c>'z'){
                    c='a';
                }
                if(!set.contains(c)){
                    j+=1;
                }
            }
            answer+=c;
        }
        return answer;
    }
}
