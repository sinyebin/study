package 백준;
import java.util.*;
public class back11399 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int p[]=new int[num];
        int temp=0;
        int answer=0;
        for(int i=0;i<num;i++){
            p[i]=scanner.nextInt();
        }
        Arrays.sort(p); 
        for(int i=0;i<num;i++){
            temp+=p[i];
            answer+=temp;            
        }
        System.out.println(answer);
    }
}
