package 프로그래머스;

public class sale {
    public static void main(String[] args) {
        String[] want={"banana", "apple", "rice", "pork", "pot"};
        int[]number={3,2,2,2,1};
        String []discount={"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        solution(want, number, discount);
    }
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int i=0;i<discount.length-9;i++){
            int cntDay=0;
            for(int j=0;j<want.length;j++){
                int cnt=0;
                for(int k=i;k<i+10;k++){
                    if(discount[k].equals(want[j])){
                        cnt++;
                    }
                }
                if(cnt<number[j]){
                    break;
                }else{
                    cntDay++;
                }
            }
            if(cntDay==want.length){
                answer++;
            }
        }
        return answer;
    }
}
