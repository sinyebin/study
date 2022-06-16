package 백준;
import java.util.*;
public class back1966 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num;i++){
            LinkedList<int[]>queue=new LinkedList<>();
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int count=0;
            for(int j=0;j<a;j++){
                queue.add(new int[]{j,scanner.nextInt()});
            }
            while(!queue.isEmpty()){
                int []arr=queue.poll();
                boolean check=true;
                for(int j=0;j<queue.size();j++){
                    if(arr[1]<queue.get(j)[1]){
                        queue.add(arr);
                        for(int k=0;k<j;k++){
                            queue.add(queue.poll());
                        }
                        check=false;
                        break;
                    }
                }
                if(check==false){
                    continue;
                }
                count++;
                if(arr[0]==b){
                    break;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
