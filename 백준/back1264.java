import java.util.Scanner;

public class back1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        while(!str.equals("#")){
            str=str.toLowerCase();
            int count=0;
            for(int i=0;i<str.length();i++){
                char c =str.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
            }
            System.out.println(count);
            str=scanner.nextLine();
        }
    }
}
