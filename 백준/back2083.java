import java.util.Scanner;

public class back2083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        while(!str.equals("# 0 0")){
            String arr[]=str.split(" ");
            if(Integer.parseInt(arr[1])>17||Integer.parseInt(arr[2])>=80){
                System.out.println(arr[0]+" Senior");
            }else{
                System.out.println(arr[0]+" Junior");
            }
            str=scanner.nextLine();
        }
    }
}
