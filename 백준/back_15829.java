package 백준;
import java.util.*;
public class back_15829 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        long answer=0;
        long r=1;
        int p=1234567891;
        int num=scanner.nextInt();
        scanner.nextLine();
        String str=scanner.nextLine();
        for(int i=0;i<num;i++){
            int a = str.charAt(i)-96;
            answer+= (a*r)%p;
            r=(r*31)%p;
        }
        System.out.println(answer%p);
    }
}
