import java.util.*;
public class back2018 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int avg=0;
        int arr[]=new int[num];
        int max=0;
        int temp=0;
        int min=0;
        int second=0;
        for(int i=0;i<num;i++){
            arr[i]=scanner.nextInt();
            avg+=arr[i];
        }
        System.out.println(Math.round((double)avg/(double)num));
        Arrays.sort(arr);
        System.out.println(arr[num/2]);
        for(int i=0;i<num-1;i++){
            if(arr[i]==arr[i+1]){
                temp++;
                if(max<temp){
                    max=temp;
                    second=i;
                    min=1;
                }else if(max==temp){
                    min++;
                    if(min==2){
                        second=i;
                    }
                }    
            }else{
                if(max==0){
                    min++;
                    if(min==2){
                        second=i;
                    }
                }
                temp=0;
            }          
        }
        System.out.println(arr[second]);
        System.out.println(arr[num-1]-arr[0]);
    }
}
