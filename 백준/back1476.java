package 백준;
import java.util.*;
public class back1476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E=1;
        int S=1;
        int M=1;
        int e=scanner.nextInt();
        int s=scanner.nextInt();
        int m=scanner.nextInt();
        int year=1;
        while(true){
            if(E==e&&S==s&&M==m){
                break;
            }
            year++;
            E++;
            S++;
            M++;
            if(E==16){
                E=1;
            }
            if(S==29){
                S=1;
            }
            if(M==20){
                M=1;
            }
        }
        System.out.println(year);
    }
}
