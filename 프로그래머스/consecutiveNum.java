package 프로그래머스;

import java.util.HashSet;

public class consecutiveNum {
    public static void main(String[] args) {
        int []elements = {7,9,1,1,4};
        solution(elements);
    }
    public static int solution(int[] elements) {
        int answer = 0;
        int []num = new int[elements.length*2];
        for(int i=0;i<elements.length;i++){
            num[i]=elements[i];
        }
        for(int i=elements.length;i<num.length;i++){
            num[i]=elements[i-elements.length];
        }
        HashSet <Integer> set= new HashSet<>();
        for(int i=0;i<elements.length;i++){
            int sum=0;
            for(int j=i;j<elements.length+i;j++){
                sum+=num[j];
                set.add(sum);
            }            
        }
        answer=set.size();
        return answer;
    }
}
