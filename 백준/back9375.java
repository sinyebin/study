package 백준;
import java.util.*;
public class back9375 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            HashMap<String,Integer> map = new HashMap<>();
            int num=scanner.nextInt();
            for(int j=0;j<num;j++){
                scanner.next();
                String str=scanner.next();
                if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                }else{
                    map.put(str,1);
                }
            }
            int result=1;
            for(int val:map.values()){
                result*=(val+1);
            }
            System.out.println(result-1);
        }
    }
}
