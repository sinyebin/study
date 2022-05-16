package 프로그래머스;

public class tech4 {
    static int [][]arr=new int[6][6];
    static int []check1=new int[6];
    static boolean [][] check2=new boolean[6][6];
    static int count=0;
    public static void main(String args[]){
        int [][]macaron={{1,1},{2,1},{1,2},{3,3},{6,4},{3,1},{3,3},{3,3},{3,4},{2,1}};
        solution(macaron);
    }
    static String []solution(int[][]macaron){
        String []answer=new String[6];
        
        for(int i=0;i<macaron.length;i++){
            int temp=macaron[i][0]-1;
            count=0;
            arr[check1[temp]][temp]=macaron[i][1];
            check2=new boolean[6][6];
            dfs(check1[temp],temp,macaron[i][1]);
            check2=new boolean[6][6];
            if(count>=2){
                delete(check1[temp],temp,macaron[i][1]);
            }
            check1[temp]++;
            while(count>=2){
                count=0;
                check2=new boolean[6][6];
                for(int j=0;j<6;j++){
                    for(int k=0;k<check1[j];k++){
                        count=0;
                        dfs(k,j,arr[k][j]);
                        check2=new boolean[6][6];
                        if(count>=2){
                            delete(k,j,arr[k][j]);
                        }
                    }
                }
            }
        }
        System.out.println();
        return answer;
    }
    static void dfs(int check, int temp, int macaron){
        check2[check][temp]=true;
        if(check+1<6&&arr[check+1][temp]==macaron&&!check2[check+1][temp]){
            count+=1;
            dfs(check+1, temp, macaron);
        }
        if(temp+1<6&&arr[check][temp+1]==macaron&&!check2[check][temp+1]){
            count+=1;
            dfs(check, temp+1, macaron);
        }
        if(check-1>=0&&arr[check-1][temp]==macaron&&!check2[check-1][temp]){
            count+=1;
            dfs(check-1, temp, macaron);
        }
        if(temp-1>=0&&arr[check][temp-1]==macaron&&!check2[check][temp-1]){
            count+=1;
            dfs(check, temp-1, macaron);
        }
        
    }
    static void delete(int check,int temp,int macaron){
        check2[check][temp]=true;
        if(check+1<6&&arr[check+1][temp]==macaron&&!check2[check+1][temp]){
            arr[check][temp]=0;
            delete(check+1, temp, macaron);
        }
        if(temp+1<6&&arr[check][temp+1]==macaron&&!check2[check][temp+1]){
            arr[check][temp]=0;
            delete(check, temp+1, macaron);
        }
        if(check-1>=0&&arr[check-1][temp]==macaron&&!check2[check-1][temp]){
            arr[check][temp]=0;
            delete(check-1, temp, macaron);
        }
        if(temp-1>=0&&arr[check][temp-1]==macaron&&!check2[check][temp-1]){
            arr[check][temp]=0;
            delete(check, temp-1, macaron);
        }
        for(int i=check;i<arr.length-1;i++){
            arr[i][temp]=arr[i+1][temp];
        }
        check1[temp]--;
    }
}
