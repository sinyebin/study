package 프로그래머스;

import java.util.HashMap;

public class memoryScore {
    public static void main(String[] args) {
        String name[]={"may", "kein", "kain", "radi"};
        int yearning[]={5, 10, 1, 3};
        String [][] photo={{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(solution(name, yearning, photo));
    }
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap <String,Integer> map = new HashMap<>();
        for(int i=0;i<name.length;i++){
            map.put(name[i], yearning[i]);
        }
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                if(map.containsKey(photo[i][j])){
                    answer[i]+=map.get(photo[i][j]);
                }
            }
        }
        return answer;
    }
}
