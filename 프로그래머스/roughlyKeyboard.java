package 프로그래머스;

import java.util.HashMap;

public class roughlyKeyboard {
    public static void main(String[] args) {
        String []keymap = {"ABACD", "BCEFD"};
        String []targets = {"ABCD","GABB"};
        solution(keymap, targets);
    }
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> map = new HashMap<>(); 
        for(int i=0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                char a = keymap[i].charAt(j);
                if(map.get(a)==null){
                    map.put(a,j);
                }else{
                    if(map.get(a)>j){
                        map.put(a, j);
                    }
                }
            }
        }

        for(int i=0;i<targets.length;i++){
            for(int j=0;j<targets[i].length();j++){
                if(map.get(targets[i].charAt(j))!=null){
                    answer[i]+=(map.get(targets[i].charAt(j))+1);
                }else{
                    answer[i]=-1;
                    break;
                }
            }
        }

        return answer;
    }
}
