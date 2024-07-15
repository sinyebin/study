import java.util.ArrayList;
import java.util.Collections;

public class clustering {
    
    public static void main(String[] args) {
        String str1="FRANCE";
        String str2="french";
        System.out.println(solution(str1, str2));
    }
    public static int solution(String str1, String str2) {
        int answer = 0;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for(int i=0;i<str1.length()-1;i++){
            char a = str1.charAt(i);
            char b = str1.charAt(i+1);

            if(Character.isLetter(a)&&Character.isLetter(b)){
                String str=Character.toString(a)+Character.toString(b);
                list1.add(str);
            }
        }

        for(int i=0;i<str2.length()-1;i++){
            char a = str2.charAt(i);
            char b = str2.charAt(i+1);

            if(Character.isLetter(a)&&Character.isLetter(b)){
                String str=Character.toString(a)+Character.toString(b);
                list2.add(str);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        for(String s: list1){
            if(list2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }

        for(String s: list2){
            union.add(s);
        }

        double intersectionSize = intersection.size();
        double unionSize = union.size();
        double jakard=0;

        if(intersectionSize==0){
            jakard=1;
        }else{
            jakard=intersectionSize/unionSize;
        }

        answer = (int) (jakard*65536);        
        return answer;
    }
}
