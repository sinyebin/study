package 프로그래머스;

public class summer1 {
    public static void main(String args[]){
        int atmos[][]={{80, 35}, {70, 38}, {100, 41}, {75,30}, {160,80}, {77, 29}, {181, 68}, {151, 76}};
        solution(atmos);
    }
    static int solution(int[][] atmos) {
        int answer = 0;
        int day=0;
        boolean check=false;
        for(int i=0;i<atmos.length;i++){
            if(atmos[i][0]>=81||atmos[i][1]>=36){
                if(day==0){
                    check=true;
                    answer++;
                }
                if(atmos[i][0]>=151&&atmos[i][1]>=76){
                    check=false;
                    day=0;
                }
            }
            if(check){
                day++;
            }
            if(day>2){
                check=false;
                day=0;
            }
        }
        return answer;
    }
}
