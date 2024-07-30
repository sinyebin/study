public class nPrimeNumber {
    public static void main(String[] args) {
        int n=437674;
        int k=16;
        solution(n, k);
    }
    public static int solution(int n, int k) {
        int answer = 0;
        String nNumber=Integer.toString(n,k);
        String arr[]=nNumber.split("0");
        for(String num:arr){
            if(num.equals("")){
                continue;
            }
            long checkNum = Long.parseLong(num);
            if(isPrime(checkNum)){
                answer+=1;
            }
        }
        return answer;
    }

    public static boolean isPrime(long checkNum){
        if(checkNum==1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(checkNum);i++){
            if(checkNum%i==0){
                return false;
            }
        }
        return true;
    }
}
