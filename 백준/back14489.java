import java.util.Scanner;

public class back14489 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if((a+b)>=c*2){
            System.out.println((a+b)-c*2);
        }else{
            System.out.println(a+b);
        }
    }
}
