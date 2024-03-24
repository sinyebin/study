import java.util.Scanner;

public class back1074 {
    static int N=0;
    static int R=0;
    static int C= 0;
    static int cnt=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        R=scanner.nextInt();
        C=scanner.nextInt();
        find(0, 0, (int)Math.pow(2, N));
    }

    public static void find(int r, int c, int size){
        if(size==1){
            System.out.println(cnt);
            return;
        }
        int newSize=size/2;
        if(R<r+newSize&&C<c+newSize){
            find(r, c, newSize);
        }
        if(R<r+newSize&&C>=c+newSize){
            cnt+=(size*size)/4;
            find(r, c+newSize, newSize);
        }
        if(R>=r+newSize&&C<c+newSize){
            cnt+=((size*size)/4)*2;
            find(r+newSize, c, newSize);
        }
        if(R>=r+newSize&&C>=c+newSize){
            cnt+=((size*size)/4)*3;
            find(r+newSize, c+newSize, newSize);
        }
    }
}
