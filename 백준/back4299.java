import java.util.Scanner;

public class back4299 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int sum=a+b;
        if((sum)%2!=0||a<b){
            System.out.println(-1);
        }else{
            int x=sum/2;
            int y=a-x;
            System.out.print((x)+" "+(y));
        }
    }   
}
