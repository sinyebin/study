package 프로그래머스;

public class math_study {
    public static void main(String args[]){
        int n=15;
        solution(n);
    }
    static int solution(int n) {
        int []arr=new int[n/2];
        int answer = 1;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length+1;j++){
                if(arr[i]>=n){
                    break;
                }
                arr[i]+=j+1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==n){
                answer++;
            }
        }
        
        return answer;
    }
}
