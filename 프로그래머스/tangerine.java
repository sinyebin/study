package 프로그래머스;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class tangerine {
    public static void main(String[] args) {
        int[]tangerine={1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(6, tangerine));
    }
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<tangerine.length;i++){
            if(map.containsKey(tangerine[i])){
                map.put(tangerine[i], map.get(tangerine[i])+1);
            }
            else{
                map.put(tangerine[i],1);
            }
        }
        Integer arr[]=new Integer[map.size()];
        int j=0;
        for(Integer key:map.keySet()){
            arr[j++]=map.get(key);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            if(k<0){
                break;
            }
            k-=arr[i];
            answer++;
        }
        return answer;
    }
}
