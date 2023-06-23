package 프로그래머스;

public class matchSchedule{
    public static void main(String args[]){
        System.out.println(solution(8,4,7));
    }
    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=0;i<n/2;i++){
            if(a==b){
                break;
            }else{
                if(a%2!=0){
                    a++;
                }
                if(b%2!=0){
                    b++;
                }
                a/=2;
                b/=2;
                answer++;
            }
        }

        return answer;
    } 
}