package 백준;
import java.util.*;
public class back7785 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        scanner.nextLine();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            String temp[]=scanner.nextLine().split(" "); 
            if(temp[1].equals("enter")){
                set.add(temp[0]);
            }else{
                if(set.contains(temp[0])){
                    set.remove(temp[0]);
                }                
            }
        }
        ArrayList<String> arr=new ArrayList<>(set);
        Collections.sort(arr,Collections.reverseOrder());
        for(String list:arr){
            System.out.println(list);
        }
    }
}
