package 백준;
import java.util.*;
public class back11721 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str=scanner.nextLine();
        while(str.length()>10){
            String temp=str;
            System.out.println(temp.substring(0,10));
            str=str.substring(10);
        }
        System.out.println(str);
    }
}
