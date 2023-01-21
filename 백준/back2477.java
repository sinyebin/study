import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back2477 {
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=0,y=0,l=0,r=0,w=0,h=0,maxW=0,maxH=0;
        int arr[]=new int[6];
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<6;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int d=Integer.parseInt(st.nextToken());
            arr[i]=Integer.parseInt(st.nextToken());
            if(d>2){
                if(maxW<arr[i]){
                    x=i;
                    maxW=arr[i];
                }
            }else{
                if(maxH<arr[i]){
                    y=i;
                    maxH=arr[i];
                }
            }
        }
        if(x+1==6){
            l=0;
        }else{
            l=x+1;
        }
        if(x-1==-1){
            r=5;
        }else{
            r=x-1;
        }
        w=Math.abs(arr[l]-arr[r]);
        if(y+1==6){
            l=0;
        }else{
            l=y+1;
        }
        if(y-1==-1){
            r=5;
        }else{
            r=y-1;
        }
        h=Math.abs(arr[l]-arr[r]);
        System.out.println(num*((arr[x]*arr[y])-(w*h)));
    }
}
