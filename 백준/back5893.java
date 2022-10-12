package 백준;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;
public class back5893{
    public static void main(String args[]) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String n=scanner.nextLine();
        BigInteger temp=new BigInteger("0");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='1'){
                temp=temp.add(new BigInteger("2").pow(n.length()-(i+1)));
            }else if(n.charAt(i)=='0'){
                temp=temp.add(new BigInteger("0"));
            }else if(n=="0"){
                bw.write(String.valueOf("0"));
            }
        }

        BigInteger result = temp.multiply(new BigInteger("17"));
        String last = "";
        while(result!=BigInteger.valueOf(0)){
            last +=result.mod(BigInteger.valueOf(2));
            result = result.divide(BigInteger.valueOf(2));
        }
        for(int i=last.length()-1;i>=0;i--){
            bw.write(String.valueOf(last.charAt(i)));
        }
        bw.flush();

    }
}