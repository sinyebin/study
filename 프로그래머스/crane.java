package 프로그래머스;
import java.util.*;
public class crane {
    public static void main(String args[]){
        int [][]board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int []moves={1,5,3,5,1,2,1,4};
        solution(board, moves);
    }
    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<moves.length;i++){
            int num=moves[i]-1;
            for(int j=0;j<board.length;j++){
                if(board[j][num]!=0){
                    if(!stack.empty()){
                        if(stack.peek()==board[j][num]){
                            stack.pop();
                            answer++;
                        }else{
                           stack.push(board[j][num]); 
                        }
                    }else{
                        stack.push(board[j][num]);
                    }
                    board[j][num]=0;
                    break;
                }
            }
        }
        return answer*2;
    }
}
