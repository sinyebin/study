package 백준;
import java.util.*;
public class back_15829 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int answer=0;
        int num=scanner.nextInt();
        scanner.nextLine();
        String str=scanner.nextLine();
        for(int i=0;i<num;i++){
            int a = str.charAt(i)-96;
            answer+= (a*Math.pow(31, i)%1234567891);
        }
        System.out.println(answer);
    }
}
