package 프로그래머스;
import java.util.*;
public class k_intern5 {
    public static void main(String args[]){
        int [][]rc={{1, 2, 3,4},{ 5, 6,7,8},{ 9,10,11,12}};
        String []operations={"ShiftRow", "Rotate", "ShiftRow", "Rotate"};
        solution(rc, operations);
    }
    static int[][] solution(int[][] rc, String[] operations) {
        int[][] answer = new int[rc.length][rc[0].length];
        for(int i=0;i<rc.length;i++){
            for(int j=0;j<rc[0].length;j++){
                answer[i][j]=rc[i][j];
            }    
        }
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("Rotate")){
                int a=answer[1][0];
                int b=answer[0][answer[0].length-1];
                int c=answer[answer.length-1][answer[0].length-1];
                int d=answer[answer.length-1][0];               
                //answer[answer.length-1][answer[0].length-1]=temp[answer.length-2][answer[0].length-1];
                for(int j=answer[0].length-1;j>0;j--){
                    answer[0][j]=answer[0][j-1];
                }
                answer[0][0]=a;
                for(int j=answer.length-1;j>0;j--){
                    answer[j][answer[0].length-1]=answer[j-1][answer[0].length-1];
                }
                answer[1][answer[0].length-1]=b;
                for(int j=0;j<answer[0].length-2;j++){
                    answer[answer.length-1][j]=answer[answer.length-1][j+1];
                }
                answer[answer.length-1][answer[0].length-2]=c;
                for(int j=1;j<answer.length-1;j++){
                    answer[j][0]=answer[j+1][0];
                }
                answer[answer.length-2][0]=d;

            }else{
                int []arr=answer[answer.length-1];
                for(int j=answer.length-1;j>0;j--){
                    answer[j]=answer[j-1];
                }
                answer[0]=arr;
            }
        }
        return answer;
    }
}
