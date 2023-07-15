package 프로그래머스;

public class longJump {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static long solution(int n) {
        long answer = 0;
        long arr[]=new long[n+1];
        if(n==1){
            answer=1;
        }else if(n==2){
            answer=2;
        }else{
            arr[0]=0;
            arr[1]=1;
            arr[2]=2;
            for(int i=3;i<=n;i++){
                arr[i]=(arr[i-1]+arr[i-2])%1234567;
            }
            answer=arr[n];
        }
        
        return answer;
    }


}
