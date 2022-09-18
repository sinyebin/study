package 백준;
import java.util.*;
public class back10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<a;i++){
            String str=scanner.nextLine();
            String arr[]=str.split(",");
            System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
        }
    }
}
