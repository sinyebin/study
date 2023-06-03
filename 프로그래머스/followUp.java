package 프로그래머스;

import java.util.HashSet;

public class followUp {
    public static void main(String args[]){
        String [] words={"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(solution(3,words));
    }
    public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashSet <String> set =new HashSet<>();
        String temp=words[0];
        set.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(temp.charAt(temp.length()-1)!=words[i].charAt(0)){
                answer[0]=(i)%n+1;
                answer[1]=(i)/n+1;
                break;
            }
            if(set.contains(words[i])){
                answer[0]=(i)%n+1;
                answer[1]=(i)/n+1; 
                break;
            }
            set.add(words[i]);
            temp=words[i];
        }

        return answer;
    }
}
