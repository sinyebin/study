package 백준;
import java.util.*;
public class back2902 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i=0;i<str.length();i++){
            if('A'<=str.charAt(i)&&str.charAt(i)<='Z'){
                System.out.print(str.charAt(i));
            }
        }
    }
}
