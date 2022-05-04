package 프로그래머스;

public class visit {
    static boolean check[][][]=new boolean[11][11][4];
    public static void main(String args[]){
        String dirs="ULURRDLLU";
        System.out.println(solution(dirs));
    }
    public static int solution(String dirs) {
        int answer = 0;
        int cX=5;
        int cY=5;
        for(int i=0;i<dirs.length();i++){
            char dr=dirs.charAt(i);
            int nX=0;
            int nY=0;
            if(dr=='U'){
                nX=cX+0;
                nY=cY+1;
                if(nX < 0 || nX > 10 || nY < 0 || nY > 10) 
                    continue;
                if(!check[nX][nY][1])
                    answer++;
                check[nX][nY][1]=true;
                check[cX][cY][0]=true;
            }else if(dr=='D'){
                nX=cX+0;
                nY=cY-1;
                if(nX < 0 || nX > 10 || nY < 0 || nY > 10) 
                    continue;
                if(!check[nX][nY][0])
                    answer++;
                check[nX][nY][0]=true;
                check[cX][cY][1]=true;
            }else if(dr=='R'){
                nX=cX+1;
                nY=cY+0;
                if(nX < 0 || nX > 10 || nY < 0 || nY > 10) 
                    continue;
                if(!check[nX][nY][2])
                    answer++;
                check[nX][nY][2]=true;
                check[cX][cY][3]=true;
            }else if(dr=='L'){
                nX=cX-1;
                nY=cY+0;
                if(nX < 0 || nX > 10 || nY < 0 || nY > 10) 
                    continue;
                if(!check[nX][nY][3])
                    answer++;
                check[nX][nY][3]=true;
                check[cX][cY][2]=true;
            }
            cX=nX;
            cY=nY;
        }
        return answer;
    }
}
