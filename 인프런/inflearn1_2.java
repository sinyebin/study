package 인프런;
import java.util.Scanner;
public class inflearn1_2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
  	    String str=scanner.nextLine();
        String answer=solution(str);
        System.out.println(answer);
        return ;
       
	}
    public static String solution(String str) {
        String answer = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65&&str.charAt(i)<=90){
                answer+=(char)(str.charAt(i)+32);
            }else{
                answer+=(char)(str.charAt(i)-32);
            }
        }
        return answer;
    
    }
}
