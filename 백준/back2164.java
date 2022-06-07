package 백준;
import java.util.*;
public class back2164 {
    public static void main(String args[]){
        Queue<Integer> queue=new LinkedList<>();
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            queue.add(i);
        }
        while(queue.size()>1){
            queue.remove();
            int a=queue.poll();
            queue.add(a);
        }
        System.out.println(queue.peek());
    }
}
