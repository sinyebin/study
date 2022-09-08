package 백준;
import java.util.*;
public class back20499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        String arr[]=str.split("/");
        int a=Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
        int b=Integer.parseInt(arr[1]);
        if(a<b||b==0){
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }
    }
}
