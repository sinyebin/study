package 백준;
import java.util.Scanner;
public class back2953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        int max=0;
        for(int i=0;i<5;i++){
            int temp=0;
            for(int j=0;j<4;j++){
                temp+=scanner.nextInt();
            }
            if(max<temp){
                max=temp;
                n=i+1;
            }
        }
        System.out.println(n+" "+max);
    }
}
