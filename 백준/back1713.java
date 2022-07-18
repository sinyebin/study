package 백준;
import java.util.*;
public class back1713 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int student[]=new int [n];
        int re[]=new int[n];
        int time[]=new int[n];
        for(int i=0;i<m;i++){
            int temp=0;
            int num=scanner.nextInt();
            for(int j=0;j<n;j++){
                if(student[j]==0||student[j]==num){
                    temp=j;
                    break;
                }
                if(re[temp]>re[j]||(re[temp]==re[j]&&time[temp]>time[j])){
                    temp=j;
                }
            }
            if(student[temp]!=num){
                student[temp]=num;
                re[temp]=0;
                time[temp]=i;
            }
            re[temp]++;
        }
        Arrays.sort(student);
        for(int i=0;i<n;i++){
            if(student[i]!=0){
                System.out.print(student[i]+" ");
            }
        }
    }
}
