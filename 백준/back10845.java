package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class back10845 {
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        Queue<Integer> queue=new LinkedList<>();
        int back=0;
        for(int i=0;i<n;i++){
            String str=br.readLine();
            if(str.contains("push")){
                String a[]=str.split(" ");
                queue.add(Integer.parseInt(a[1]));
                back=Integer.parseInt(a[1]);
            }else if(str.contains("pop")){
                if(queue.isEmpty())
                    sb.append(-1).append('\n');
                else
                    sb.append(queue.poll()).append('\n');
            }else if(str.contains("size")){
                sb.append(queue.size()).append('\n');
                
            }else if(str.contains("empty")){
                if(queue.isEmpty())
                    sb.append(1).append('\n');
                else
                    sb.append(0).append('\n');
            }else if(str.contains("front")){
                if(queue.isEmpty())
                    sb.append(-1).append('\n');
                else
                    sb.append(queue.peek()).append('\n');
            }else{
                if(queue.isEmpty())
                    sb.append(-1).append('\n');
                else
                    sb.append(back).append('\n');
            }
        }
        System.out.println(sb);
    }
}
