package 백준;
import java.util.*;
public class back10824 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a=scanner.nextLong();
        long b=scanner.nextLong();
        long c=scanner.nextLong();
        long d=scanner.nextLong();
        String ab=Long.toString(a)+Long.toString(b);
        String cd=Long.toString(c)+Long.toString(d);
        System.out.println(Long.parseLong(ab)+Long.parseLong(cd));
    }
}
