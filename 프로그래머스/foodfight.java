package 프로그래머스;

public class foodfight {
    public static void main(String[] args) {
        int []food ={1, 2, 2, 2, 2};
        System.out.println(solution(food));
    }

    public static String solution(int[] food) {
        String answer = "";
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                answer+=i;
            }
        }
        answer+="0";
        for(int i=food.length-1;i>0;i--){
            for(int j=0;j<food[i]/2;j++){
                answer+=i;
            }
        }
        return answer;
    }
}
