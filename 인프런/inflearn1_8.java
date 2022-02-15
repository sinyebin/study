package 인프런;
import java.util.Scanner;
public class inflearn1_8 {
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
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if((int)arr[l]<97||(int)arr[l]>122){
                l++;
            }else if((int)arr[r]<97||(int)arr[r]>122){
                r--;
            }else{
                if(arr[l]!=arr[r]){
                    answer="NO";
                    break;
                }else{
                    l++;
                    r--;
                }
            }
        }
        return answer;
    
    }
}
