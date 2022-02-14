package 인프런;
import java.util.Scanner;
public class inflearn1_6 {
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
        char arr2[]=new char[arr.length];
        boolean check=true;
        arr2[0]=arr[0];
        answer+=arr[0];
        int k=1;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<k;j++){
                if(arr[i]==arr2[j]){
                    check=false;
                    break;
                }
            }
            if(check==true){
                arr2[k]=arr[i];
                k++;
                answer+=arr[i];
            }
            check=true;
        }
        return answer;
    
    }
}
