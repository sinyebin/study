package 프로그래머스;

public class numberword {
    public static void main(String args[]){
        String s="one4seveneight";
        solution(s);
    }
    static int solution(String s) {
        int answer = 0;
        String num[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<10;i++){
            s=s.replace(num[i],Integer.toString(i));
        }
        answer=Integer.parseInt(s);
        return answer;
    }
}
