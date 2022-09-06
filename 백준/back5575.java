package 백준;
import java.util.*;
public class back5575 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        for(int i=0;i<3;i++){
            int arr[]=new int[6];
            for(int j=0;j<6;j++){
                arr[i]=scanner.nextInt();
            }
            int s=arr[5]-arr[2];
            int m=arr[4]-arr[1];
            int h=arr[3]-arr[0];
            if(s<0){
                s=60+s;
                m--;
            }
            if(m<0){
                m=60+s;
                h--;
            }
            System.out.println(h+" "+m+" "+s);           
        }
    }
}
