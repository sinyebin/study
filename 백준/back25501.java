import java.util.Scanner;
public class back25501{
    static int num=0;
    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else{
            num++;
            return recursion(s, l+1, r-1);
        } 
    }
    public static int isPalindrome(String s){
        num=1;
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<t;i++){
            String s=scanner.nextLine();
            System.out.println(isPalindrome(s)+" "+num);
        }
    }
}
