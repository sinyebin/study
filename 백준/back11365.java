import java.util.Scanner;

public class back11365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        while(!str.equals("END")){
            for(int i=str.length()-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }
            System.out.println();
            str=scanner.nextLine();
        }
    }
}
