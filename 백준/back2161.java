package 백준;
import java.util.*;
public class back2161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<num;i++){
            queue.add(i+1);
        }
        int k=1;
        while(queue.size()!=1){
            if(k%2==1){
                System.out.print(queue.poll()+" ");
                k++;
            }else{
                int temp=queue.poll();
                queue.add(temp);
                k++;
            }
        }
        System.out.print(queue.poll());
    }
}
