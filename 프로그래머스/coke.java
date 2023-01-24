package 프로그래머스;

public class coke {
    public static void main(String[] args) {
        int a= 2;
        int b = 1;
        int n = 20;
        int result=solution(a,b,n);
    }
    public static int solution(int a, int b, int n) {
        int answer = 0;
        answer= getCoke(a,b,n,answer);
        return answer;
    }
    public static int getCoke(int a,int b, int n, int answer){
        if(n<a){
            return answer;
        }else{
            answer+=(n/a)*b;
            n=(n%a)+(n/a)*b;
            return getCoke(a, b, n, answer);
        }
    } 
}
