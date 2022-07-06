package 백준;
import java.util.*;
public class back17219 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        HashMap<String,String>map=new HashMap<>();
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<num1;i++){
            String[] temp=scanner.nextLine().split(" ");
            map.put(temp[0], temp[1]);
        }
        for(int i=0;i<num2;i++){
            String temp=scanner.nextLine();
            System.out.println(map.get(temp));
        }
    }
}
