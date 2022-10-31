package 백준;
import java.util.*;
public class back15904 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char []ucpc={'U','C','P','C'};
        String str=scanner.nextLine();
        int index=0;
        boolean check=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ucpc[index]){
                index++;
            }
            if(index==4){
                check=true;
                break;
            }
        }
        if(check){
            System.out.println("I love UCPC");
        }else{
            System.out.println("I hate UCPC");
        }
   } 
}
