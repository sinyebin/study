package swea;
import java.util.*;
public class swea10912 {
    public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
		{
			String str=sc.next();
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                if(map.containsKey(str.charAt(i))){
                    int num=map.get(str.charAt(i));
                    num++;
                 	map.put(str.charAt(i),num);   
                }else{
                    map.put(str.charAt(i),1);
                }
            }
            String answer="";
            boolean check=true;
            for(Character key:map.keySet()){
             	   if(map.get(key)%2!=0){
                       answer+=key;
                       check=false;
                   }
            }
            if(!check){
                 char[]arr=answer.toCharArray();
                Arrays.sort(arr);
                System.out.print("#"+test_case+" ");
                for(int i=0;i<arr.length;i++){
                 	System.out.print(arr[i]);
                }
                System.out.println();
            }else{
             	System.out.println("#"+test_case+" Good");   
            }
        }
    }
}
