package 백준;
import java.util.*;
public class back1010 {
    static int [][]arr=new int[30][30];
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            int b=scanner.nextInt();
            int a=scanner.nextInt();
            System.out.println(combi(a,b));
        }
    }
    static int combi(int a, int b){
        if(arr[a][b]>0){
            return arr[a][b];
        }
        if(a==b||b==0){
            return arr[a][b]=1;
        }
        return arr[a][b]=combi(a-1,b-1)+combi(a-1,b);
    }
}
