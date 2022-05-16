package 프로그래머스;

import java.util.Arrays;
import java.util.Collections;

public class tech1 {
    public static void main(String args[]){
        int []v={20,18,17,16,17};
        int a=3;
        int b=1;
        solution(v, a, b);
    }
    static int solution(int[]v,int a, int b){
        int answer=0;
        Integer arr[]=new Integer[v.length];
        boolean check=true;
        for(int i=0;i<v.length;i++){
            arr[i]=v[i];
        }
        Arrays.sort(arr,Collections.reverseOrder());
        int j=0;
        while(check){
            for(int i=0;i<arr.length;i++){
                if(i!=j){
                    if(arr[i]-b<0){
                        check=false;
                        break;
                    }else{
                        arr[i]-=b;
                    }
                }else{
                    if(arr[i]-a<0){
                        check=false;
                        break;
                    }else{
                        arr[i]-=a;
                    }
                }
            }
            if(check){
                answer++;
                if(j!=arr.length-1&&j!=0){
                    if(arr[j-1]>arr[j]){
                        if(arr[j-1]>=arr[j+1]){
                            j=j-1;
                        }else{
                            j=j+1;
                        }
                    }else{
                        if(arr[j]<arr[j+1]){
                            j=j+1;
                        }
                    }
                }else if(j==0){
                    if(arr[arr.length-1]>arr[j]){
                        if(arr[arr.length-1]>=arr[j+1]){
                            j=arr.length-1;
                        }else{
                            j=j+1;
                        }
                    }else{
                        if(arr[j]<arr[j+1]){
                            j=j+1;
                        }
                    }
                }else{
                    if(arr[j-1]>arr[j]){
                        if(arr[j-1]>=arr[0]){
                            j=j-1;
                        }else{
                            j=0;
                        }
                    }else{
                        if(arr[j]<arr[0]){
                            j=0;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
