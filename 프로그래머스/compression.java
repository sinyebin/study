import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class compression {
    public static void main(String[] args) {
        String msg="KAKAO";
        solution(msg);
    }

    public static List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> book = new HashMap<>();

        char word='A';
        for(int i=1;i<='Z'-'A'+1;i++){
            book.put(word+"", i);
            word+=1;
        }

        int idx=0;
        while(idx<msg.length()){
            String str="";
            while(idx<msg.length()){
                if(!book.containsKey(str+msg.charAt(idx))){
                    break;
                }else{
                    str+=msg.charAt(idx);
                }
                idx++;
            }
            answer.add(book.get(str));

            if(idx<msg.length()){
                book.put(str+msg.charAt(idx), book.size()+1);
            }
        }
        return answer;
    }
}
