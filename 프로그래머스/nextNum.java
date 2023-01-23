package 프로그래머스;

public class nextNum{
    public static void main(String[] args) {
        int []common={1,2,3,4};
        solution(common);
    }
    public static int solution(int[] common) {
        int answer = 0;
        int d=common[1]-common[0];
        if(common[1]+d==common[2]){
            answer=common[common.length-1]+d;
        }else{
            int r=common[1]/common[0];
            answer=common[common.length-1]*r;
        }      
        return answer;
    }
}