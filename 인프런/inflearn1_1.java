package 인프런;

import java.util.Scanner;
public class inflearn1_1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
  	    String str=scanner.nextLine();
        String a=scanner.next();
        int answer=solution(str,a);
        System.out.println(answer);
        return ;
	}
    public static int solution(String str,String a) {
        int answer = 0;
        str=str.toLowerCase();
        a=a.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==a.charAt(0)){
                answer++;
            }
        }
        return answer;
    }
}