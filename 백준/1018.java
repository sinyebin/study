import java.util.*;
class Main{
    public static void main(String args[]){
        char[][]b_ori={
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'}
        };
        char[][]w_ori={
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'}
        };
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        char [][] chess=new char[x][y];
        for(int i=0;i<x;i++){
            String s=scanner.next();
            chess[i]=s.toCharArray();
            
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=x-8;i++){
            for(int j=0;j<=y-8;j++){
                int b_min=0;
                int w_min=0;
                for(int k=0;k<8;k++){
                    for(int l=0;l<8;l++){
                        if(w_ori[k][l]!=chess[k+i][l+j]){
                            w_min++;
                        }else if(b_ori[k][l]!=chess[k+i][l+j]){
                            b_min++;
                        }
                    }
                }
                min=Integer.min(min,Integer.min(w_min,b_min));
            }
        }
        System.out.println(min);
    }
}