package 백준;
import java.util.*;
public class back11656 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        String []arr=new String[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.substring(i, str.length());
        }

        
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
