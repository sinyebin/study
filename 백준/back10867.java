package 백준;
import java.util.*;
public class back10867 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            set.add(scanner.nextInt());
        }
        ArrayList<Integer>list = new ArrayList<>(set);
        Collections.sort(list);
        for(int l:list){
            System.out.print(l+" ");
        }
    }
}
