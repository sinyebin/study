import java.util.Scanner;

public class back11948 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[6];
        int min=101;
        int at=0;
        int sum=0;
        for(int i=0;i<4;i++){
            arr[i]=scanner.nextInt();
            if(arr[i]<min){
                min=arr[i];
                at=i;
            }
        }
        arr[at]=0;
        min=101;
        at=4;
        for(int i=4;i<6;i++){
            arr[i]=scanner.nextInt();
            if(arr[i]<min){
                min=arr[i];
                at=i;
            }
        }
        arr[at]=0;
        for(int i=0;i<6;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
