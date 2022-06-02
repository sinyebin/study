package 백준;
import java.util.*;
public class back11478 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            String a="";
            for(int j=i;j<str.length();j++){
                a+=str.substring(j, j+1);
                set.add(a);
            }
        }
        System.out.println(set.size());
    }
}
