package 백준;
import java.util.*;
public class back1269 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        HashSet <Integer>set1 = new HashSet<>();
        HashSet <Integer>set2 = new HashSet<>();
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int answer=0;
        for(int i=0;i<num1;i++){
            int temp=scanner.nextInt();
            set1.add(temp);
        }
        for(int i=0;i<num2;i++){
            int temp=scanner.nextInt();
            set2.add(temp);
        }
        for(Integer temp:set1){
            if(!set2.contains(temp)){
                answer++;
            }
        }
        for(Integer temp:set2){
            if(!set1.contains(temp)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
