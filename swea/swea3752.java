package swea;
import java.util.Scanner;
import java.util.*;
public class swea3752 {
    static HashSet<Integer> set;
    static int[]score;
    static ArrayList<Integer> arr;
    static int num;
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
            num=sc.nextInt();
            score=new int[num];
            arr=new ArrayList<>();      
            set=new HashSet<>();      
            set.add(0);
            arr.add(0);
            for(int i=0;i<num;i++){
                score[i]=sc.nextInt();    
            }
            check(0);
            System.out.println("#"+test_case+" "+set.size());
        }
    }
    static void check(int cnt){
        if(cnt==num){
            return;
        }
        int len = arr.size();
        for(int i=0;i<len;i++){
            if(!set.contains(arr.get(i)+score[cnt])){
                set.add(arr.get(i)+score[cnt]);
                arr.add(arr.get(i)+score[cnt]);
            }
        }
        check(cnt+1);
    }
}
