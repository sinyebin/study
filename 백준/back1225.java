package 백준;
import java.util.*;;
public class back1225 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String num[]=scanner.nextLine().split(" ");
        long result=0;
        for(int i=0;i<num[0].length();i++){
            for(int j=0;j<num[1].length();j++){
                result+=Integer.parseInt(num[0].charAt(i)+"")*Integer.parseInt(num[1].charAt(j)+"");
            }
        }
        System.out.println(result);
    }
}
