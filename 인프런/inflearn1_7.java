package 인프런;
import java.util.*;
public class inflearn1_7 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String answer=solution(str);
        System.out.println(answer);
        return ;
       
	}
    public static String solution(String str) {
        String answer = "YES";
        str=str.toLowerCase();
        char arr[]=str.toCharArray();
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            if(arr[i]!=arr[j]){
                answer="NO";
                break;
            }
        }
        return answer;
    
    }
}
