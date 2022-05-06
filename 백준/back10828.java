package 백준;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class back10828 {
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            String str=br.readLine();
            if(str.contains("push")){
                String a[]=str.split(" ");
                stack.push(Integer.parseInt(a[1]));
            }else if(str.contains("pop")){
                if(stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.pop());
            }else if(str.contains("size")){
                System.out.println(stack.size());
            }else if(str.contains("empty")){
                if(stack.empty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }else if(str.contains("top")){
                if(stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
            }
        }
    }
}
