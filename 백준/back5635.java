package 백준;
import java.util.*;
public class back5635 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Birth> births = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name=scanner.next();
            String d=scanner.next();
            String m=scanner.next();
            String y=scanner.next();
            if(d.length()<2){
                d="0"+d;
            }
            if(m.length()<2){
                m="0"+m;
            }
            int bir=Integer.parseInt(y+m+d);
            births.add(new Birth(name, bir));
        }
        Collections.sort(births);
        System.out.println(births.get(0).name);
        System.out.println(births.get(n-1).name);
    }

}
class Birth implements Comparable<Birth>{
    String name;
    int day;
    public Birth(String name, int day){
        this.name=name;
        this.day=day;
    }

    public int compareTo(Birth o){
        return o.day-this.day;
    }
}
