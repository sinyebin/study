package 백준;
import java.util.*;
public class back10816 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num;i++){
            int temp=scanner.nextInt();
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp, 1);
            }            
        }
        num=scanner.nextInt();
        for(int i=0;i<num;i++){
            int temp=scanner.nextInt();
            if(map.containsKey(temp)){
                sb.append(map.get(temp)).append(" ");
            } else{
                sb.append("0 ");
            }
        }
        System.out.println(sb);
        
    }
}
