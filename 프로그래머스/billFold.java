package 프로그래머스;

public class billFold {
    public static void main(String[] args) {
        int[] wallet = {30,15};
        int bill[] = {26,17};
        solution(wallet, bill);
    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(true){
            if((wallet[0]>=bill[0]&&wallet[1]>=bill[1])||(wallet[0]>=bill[1]&&wallet[1]>=bill[0])){
                break;
            }
            if(bill[0]>bill[1]){
                bill[0]/=2;
            }else{
                bill[1]/=2;;
            }
            answer++;
        }
        return answer;
    }
}
