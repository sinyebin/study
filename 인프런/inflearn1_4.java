package 인프런;
import java.util.*;
public class inflearn1_4 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
  	    int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            String str=scanner.next();
            String answer = solution(str);
            System.out.println(answer);
        }
        return ;
       
	}
    public static String solution(String str) {
        String answer = "";
        char[] a=str.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            answer+=a[i];
        }
        return answer;
    
    }
}
