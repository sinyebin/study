package 백준;
import java.util.*;
public class back1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[9];
        String str=scanner.nextLine();
        int max=0;
        for(int i=0;i<str.length();i++){
            int temp=Integer.parseInt(str.substring(i, i+1));
            if(temp==9){
                arr[6]++;
            }else{
                arr[temp]++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i==6){
                if(arr[i]%2==0){
                    max=Math.max(max,arr[i]/2);
                }else{
                    max=Math.max(max,(arr[i]/2)+1);
                }
            }else{
                max=Math.max(max,arr[i]);
            }
        }
        System.out.println(max);
    }
}
