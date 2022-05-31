package 백준;
import java.util.*;
public class back14425 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        HashSet<String> set = new HashSet<>();
        scanner.nextLine();
        for(int i=0;i<n;i++){
            String temp=scanner.nextLine();
            set.add(temp);
        }
        int answer=0;
        for(int i=0;i<m;i++){
            String temp=scanner.nextLine();
            if(set.contains(temp)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
