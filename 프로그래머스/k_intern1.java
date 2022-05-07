package 프로그래머스;
import java.util.*;
public class k_intern1 {
    public static void main(String args[]){
        String[]survey={"AN", "CF", "MJ", "RT", "NA"};
        int []choices={5, 3, 2, 7, 5};
        solution(survey, choices);
    }
    static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character,Integer> hash=new HashMap<>();
        hash.put('R',0);
        hash.put('T',0);
        hash.put('C',0);
        hash.put('F',0);
        hash.put('J',0);
        hash.put('M',0);
        hash.put('A',0);
        hash.put('N',0);
        for(int i=0;i<choices.length;i++){
            if(choices[i]>4){
                char ch=survey[i].charAt(1);
                if(hash.containsKey(ch)){
                    int num=hash.get(ch);
                    hash.put(ch, num+choices[i]-4);
                }else{
                    hash.put(ch,choices[i]-4);
                }
            }else if(choices[i]<4){
                char ch=survey[i].charAt(0);
                if(hash.containsKey(ch)){
                    int num=hash.get(ch);
                    hash.put(ch, num+4-choices[i]);
                }else{
                    hash.put(ch,4-choices[i]);
                }
            }
        }
        if(hash.get('R')>=hash.get('T')){
            answer+='R';
        }else{
            answer+='T';
        }
        if(hash.get('C')>=hash.get('F')){
            answer+='C';
        }else{
            answer+='F';
        }
        if(hash.get('J')>=hash.get('M')){
            answer+='J';
        }else{
            answer+='M';
        }
        if(hash.get('A')>=hash.get('N')){
            answer+='A';
        }else{
            answer+='N';
        }
        return answer;
    }
}
