package 프로그래머스;
import java.util.*;
public class jumpAndTel {
    public static void main(String[] args) {
        System.out.println(solution(5000));
    }

    public static int solution(int n) {
        int ans = 0;
        while(n>0){
            if(n%2==0){
                n/=2;
            }else{
                ans++;
                n-=1;
                n/=2;
            }
        }
        return ans;
    }
}
