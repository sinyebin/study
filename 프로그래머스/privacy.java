package 프로그래머스;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class privacy {
    public static void main(String args[]) throws ParseException{
        String today="2022.05.19";
        String terms[]={"A 6", "B 12", "C 3"};
        String privacies[]={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        solution(today,terms,privacies);
    }
    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        HashMap<String,Integer> termsMap=new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<terms.length;i++){
            String termss[]=terms[i].split("\\s+");
            termsMap.put(termss[0], Integer.parseInt(termss[1]));
        }
        for(int i=0;i<privacies.length;i++){
            String temp[]=privacies[i].split("\\s+");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
            Date todayDate = new Date(dateFormat.parse(today).getTime());
            Date compareDate = new Date(dateFormat.parse(temp[0]).getTime());
            Calendar cal = Calendar.getInstance();
            cal.setTime(compareDate);
            cal.add(Calendar.MONTH,termsMap.get(temp[1]));
            compareDate=cal.getTime();
            int compare = todayDate.compareTo(compareDate);
            if(compare >= 0) {
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
