import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Stream;

public class tuple {
    public static void main(String[] args) {
        String s="{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(solution(s));
    }
    public static  int[] solution(String s) {
        s=s.replaceAll("\\{", "");
        s=s.substring(0,s.length()-2);
        System.out.println(s);
        String[] arr=s.split("\\}\\,");
        Arrays.sort(arr,Comparator.comparingInt(String::length));

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int[]tuple = Stream.of(arr[i].split(",")).mapToInt(Integer::parseInt).toArray();
            for(int num:tuple){
                if(!set.contains(num)){
                    list.add(num);
                    set.add(num);
                }
            }
        }
        int[] answer = new int[list.size()];

        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
        

}
