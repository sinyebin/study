package 인프런;
import java.util.*;
public class inflearn1_5 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String answer = solution(str);
        System.out.println(answer);
        return ;   
	}
    public static String solution(String str) {
        String answer = "";
        char[] a=str.toCharArray();
        int lt=0;
        int rt=str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(a[lt])){
                lt++;
            }else if(!Character.isAlphabetic(a[rt])){
                rt--;
            }else{
                char temp=a[lt];
                a[lt]=a[rt];
                a[rt]=temp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(a);
        return answer;   
    }
}
