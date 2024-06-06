import java.util.HashMap;
import java.util.Map;

public class clothes{
    public static void main(String[] args) {
        String [][] clothes= {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> category= new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            if(category.containsKey(clothes[i][1])){
                category.put(clothes[i][1], category.get(clothes[i][1])+1);
            }else{
                category.put(clothes[i][1], 1);
            }
        }
        for(String key : category.keySet()) {
            answer *= (category.get(key) + 1);   
        }
        answer-=1;
        return answer;
    }
}