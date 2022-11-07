package 백준;
import java.util.*;

public class back2217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        Integer rope[]=new Integer[n];
        int max=0;
        for(int i=0;i<n;i++){
            rope[i]=scanner.nextInt();
        }
        Arrays.sort(rope,Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int temp=rope[i]*(i+1);
            if(max<temp){
                max=temp;
            }
        }
        System.out.println(max);
    }
}
