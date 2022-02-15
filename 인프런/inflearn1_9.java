package 인프런;
import java.util.Scanner;
public class inflearn1_9 {
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
        char arr[]=str.toCharArray();
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            if(!check){
                if(arr[i]>48&&arr[i]<58){
                    answer+=arr[i];
                    check=true;
                }
            }else{
                if(arr[i]>47&&arr[i]<58){
                    answer+=arr[i];
                }
            }
        }
        return answer;
    
    }
}
