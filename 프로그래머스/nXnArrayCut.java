package 프로그래머스;

public class nXnArrayCut {
    public static void main(String[] args) {
        int n=3;
        int left=2;
        int right=5;
        System.out.println(solution(n, left, right));
    }
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right-(int)left+1];
        int k=0;
        for(long i=left;i<=right;i++){
            long row=i/n;
            long col=i%n;
            answer[k++]= Math.max((int)row, (int)col) + 1;
        }
        return answer;
    }
}
