package 프로그래머스;

import java.util.ArrayList;

public class cache {
    public static void main(String[] args) {
        int cacheSize=3;
        String cities[]={"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize,cities));
    }
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> citiesArray= new ArrayList<>();
        if(cacheSize==0){
            return cities.length*5;
        }
        for(int i=0;i<cities.length;i++){
            String city=cities[i].toLowerCase();
            if(citiesArray.contains(city)){
                citiesArray.remove(city);
                citiesArray.add(city);
                answer+=1;
                continue;
            }
            if(citiesArray.size()>=cacheSize){
                citiesArray.remove(0);
            }
            citiesArray.add(city);
            answer+=5;
        }
        return answer;
    }
}
