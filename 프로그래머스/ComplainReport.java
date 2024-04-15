package 프로그래머스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplainReport {
    public static void main(String[] args) {
        String[] id_list={"muzi", "frodo", "apeach", "neo"};
        String[] report={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k=2;
        solution(id_list, report, k);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String,Integer> idIndex=new HashMap<>();
        Map<String, List<String>> reportMap = new HashMap<>();
        for(int i=0;i<id_list.length;i++){
            idIndex.put(id_list[i], i);
            reportMap.put(id_list[i], new ArrayList<>());
        }

        for(int i=0;i<report.length;i++){
            String splitReport[] = report[i].split(" ");
            if(!reportMap.get(splitReport[1]).contains(splitReport[0])){
                reportMap.get(splitReport[1]).add(splitReport[0]);
            }
        }

        for(String id: reportMap.keySet()){
            if(reportMap.get(id).size()>=k){
                for(String p:reportMap.get(id)){
                    answer[idIndex.get(p)]++;
                }
            }
        }
        return answer;
    }
}
