package 프로그래머스;

public class overcoat {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int section[]= {2,3,6};
        solution(n, m, section);
    }
    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        int end = section[0]+m;
        for(int i=0;i<section.length;i++){
            if(section[i]>=end){
                start=section[i];
                end=section[i]+m;
                answer+=1;
            }
        }
        return answer;
    }
}
