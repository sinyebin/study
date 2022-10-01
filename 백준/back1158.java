package 백준;
import java.util.*;
public class back1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        for(int i=0;i<n;i++){
            queue.offer(i+1);
        }
        while(queue.size()!=1){
            for(int i=0;i<k-1;i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()+", ");
        }
        sb.append(queue.poll()+">");
        System.out.println(sb.toString());
    }
}
