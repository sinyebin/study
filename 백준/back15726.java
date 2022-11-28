import java.util.Scanner;
public class back15726 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        double a=scanner.nextInt();
        double b=scanner.nextInt();
        double c=scanner.nextInt();
        max=Math.max((int)(a*b/c),(int)(a/b*c));
        System.out.println(max);
    }
}
