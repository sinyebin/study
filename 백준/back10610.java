package 백준;
import java.util.*;
public class back10610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] n=scanner.nextLine().toCharArray();
        int sum=0;
        Arrays.sort(n);
        StringBuilder sb=new StringBuilder();
        for(int i=n.length-1;i>=0;i--){
            int num=n[i]-'0';
            sum+=num;
            sb.append(num);
        }
        if(n[0]!='0'||sum%3!=0){
            System.out.println(-1);
            return;
        }
        System.out.println(sb.toString());
    }
}
