package 인프런;
import java.util.Scanner;
public class inflearn1_3 {
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
        String a[]=str.split(" ");
        answer=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i].length()>answer.length()){
                answer=a[i];
            }
        }
        return answer;
    
    }
}
