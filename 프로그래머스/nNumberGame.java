public class nNumberGame {
    public static void main(String[] args) {
        int n=2;
        int t=4;
        int m=2;
        int p=1;
        solution(n, t, m, p);
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        int gameCount= t*m;
        String str="";
        int num=0;
        while(str.length()<gameCount){
            str+=Integer.toString(num++,n);
        }
        for(int i=p-1;i<gameCount;i+=m){
            answer+=str.charAt(i);
        }
        return answer.toUpperCase();
    }
}
