package 프로그래머스;

public class summer3 {
    public static void main(String args[]){
        String line="Q4OYPI";
        solution(line);
    }
    static int[] solution(String line) {
        int[] answer = new int[line.length()];
        int l_x=1;
        int l_y=2;
        int r_x=10;
        int r_y=2;
        for(int i=0;i<line.length();i++){
            int n_x=0;
            int n_y=0;
            if(line.charAt(i)>=65){
                n_y=2;
                char a=line.charAt(i);
                if(a=='Q'){
                    n_x=1;
                }else if(a=='W'){
                    n_x=2;
                }else if(a=='E'){
                    n_x=3;
                }else if(a=='R'){
                    n_x=4;
                }else if(a=='T'){
                    n_x=5;
                }else if(a=='Y'){
                    n_x=6;
                }else if(a=='U'){
                    n_x=7;
                }else if(a=='I'){
                    n_x=8;
                }else if(a=='O'){
                    n_x=9;
                }else if(a=='P'){
                    n_x=10;
                }
            }else{
                n_y=1;
                n_x=line.charAt(i)-48;
                if(n_x==0){
                    n_x=10;
                }
                
            }
            if(Math.abs(l_x-n_x)+Math.abs(l_y-n_y)<Math.abs(r_x-n_x)+Math.abs(r_y-n_y)){
                l_x=n_x;
                l_y=n_y;
                answer[i]=0;
            }else if(Math.abs(l_x-n_x)+Math.abs(l_y-n_y)>Math.abs(r_x-n_x)+Math.abs(r_y-n_y)){
                r_x=n_x;
                r_y=n_y;
                answer[i]=1;
            }else{
                if(Math.abs(l_x-n_x)<Math.abs(r_x-n_x)){
                    l_x=n_x;
                    l_y=n_y;
                    answer[i]=0;
                }else if(Math.abs(l_x-n_x)>Math.abs(r_x-n_x)){
                    r_x=n_x;
                    r_y=n_y;
                    answer[i]=1;
                }else{
                    if(n_x<6){
                        l_x=n_x;
                        l_y=n_y;
                        answer[i]=0;  
                    }else{
                        r_x=n_x;
                        r_y=n_y;
                        answer[i]=1;
                    }
                }
            }
        }
        return answer;
    }
}
