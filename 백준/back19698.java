import java.util.Scanner;

public class back19698 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int w=scanner.nextInt();
        int h=scanner.nextInt();
        int l=scanner.nextInt();
        int c=(w/l)*(h/l);
        if(c>=n){
            System.out.println(n);
        }else{
            System.out.println(c);
        }
    }
}
