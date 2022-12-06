import java.util.Scanner;
public class back13136 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        int n=scanner.nextInt();
        long x,y;
        if(r%n>0){
            x=r/n+1;
        }else{
            x=r/n;
        }
        if(c%n>0){
            y=c/n+1;
        }else{
            y=c/n;
        }
        System.out.println(x*y);
    }
}
