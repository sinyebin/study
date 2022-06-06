package 백준;
import java.util.*;
public class back11729 {
    public static StringBuilder sb=new StringBuilder();
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        sb.append((int)(Math.pow(2,num)-1)).append('\n');
        Hanoi(num,1,2,3);
        System.out.println(sb);
    }
    public static void Hanoi(int num, int a, int b, int c){
        if(num==1){
            sb.append(a+" "+c+"\n");
            return;
        }
        Hanoi(num-1, a, c, b);
        sb.append(a+" "+c+"\n");
        Hanoi(num-1, b, a, c);
    }
}
