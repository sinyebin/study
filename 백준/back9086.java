package 백준;
import java.util.*;
public class back9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<num;i++){
            String str=scanner.nextLine();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
    }   
}
