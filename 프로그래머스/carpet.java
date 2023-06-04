package 프로그래머스;

public class carpet {
    public static void main(String args[]){
        
        System.out.println(solution(10,2));
    }
    public static int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int sum=brown+yellow;
        for(int i=1;i<sum;i++){
            int r=i;
            int c=sum/r;
            if(r>c){
                continue;
            }
            if((r-2)*(c-2)==yellow){
                answer[0]=c;
                answer[1]=r;
                break;
            }
        }
        return answer;
    }
}
