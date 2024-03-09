package 프로그래머스;

public class splitString {
    public static void main(String[] args) {
        String s="abracadabra";
        solution(s);
    }

    public static int solution(String s) {
        int answer = 0;
        char x=s.charAt(0);
        int xNum=0;
        int yNum=0;
        for(int i=0;i<s.length();i++){
            if(xNum==yNum){
                answer++;
                x=s.charAt(i);
            }
            if(s.charAt(i)==x){
                xNum++;
            }else{
                yNum++;
            }
        }
        return answer;
    }
}
